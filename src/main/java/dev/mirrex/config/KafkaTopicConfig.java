package dev.mirrex.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic mirrexdevTopic() {
        return TopicBuilder.name("mirrexdev")
                .build();
    }
}
