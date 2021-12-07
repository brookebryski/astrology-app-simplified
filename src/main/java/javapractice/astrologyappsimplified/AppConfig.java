package javapractice.astrologyappsimplified;

import org.springframework.context.annotation.Bean;

import java.util.concurrent.Flow;

public class AppConfig {

@Bean(name = "iZodiacValidator")
    public ZodiacValidator createZodiacValidator() {
    return new ZodiacValidator();
}

@Bean(name = "iZodiac")
    public Zodiac createZodiac() {
    return new Zodiac();
}

@Bean(name = "iFlowControl")
    public FlowControl createFlowControl() {
    return new FlowControl(createZodiacValidator(), createZodiac());
    }
}
