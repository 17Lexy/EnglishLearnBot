package English.EnglishLearnBot.Bot;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@ConfigurationProperties("bot")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TelegramProperties {

    String name;
    String token;
    String path;

}
