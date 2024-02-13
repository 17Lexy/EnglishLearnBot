package English.EnglishLearnBot.Service;

import English.EnglishLearnBot.Bot.Bot;
import English.EnglishLearnBot.Service.Handler.CallbackQueryHandler;
import English.EnglishLearnBot.Service.Handler.CommandHandler;
import English.EnglishLearnBot.Service.Handler.MessageHandler;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@Slf4j
public class UpdateDispatcher {

    final MessageHandler messageHandler;
    final CallbackQueryHandler callbackQueryHandler;
    final CommandHandler commandHandler;

    @Autowired
    public UpdateDispatcher(MessageHandler messageHandler, CallbackQueryHandler callbackQueryHandler, CommandHandler commandHandler) {
        this.messageHandler = messageHandler;
        this.callbackQueryHandler = callbackQueryHandler;
        this.commandHandler = commandHandler;
    }


    public BotApiMethod<?> distribute(Update update, Bot bot){
        if(update.hasCallbackQuery()){
            return callbackQueryHandler.answer(update.getCallbackQuery(),bot);
        }
        if(update.hasMessage()){
            Message message = update.getMessage();
            if(message.hasText()){
                if(message.getText().charAt(0) == '/'){
                    return commandHandler.answer(message, bot);
                }
            }
            return messageHandler.answer(message,bot);
        }
        log.info("Unsupported update: " + update);
        return null;
    }
}
