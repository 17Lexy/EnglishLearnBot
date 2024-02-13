package English.EnglishLearnBot;

import English.EnglishLearnBot.Bot.TelegramProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TelegramProperties.class)
public class EnglishLearnBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnglishLearnBotApplication.class, args);

	}

}
