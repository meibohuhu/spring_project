package net.javaguides.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    private String topicName = "javaguides";

    @Bean
    public NewTopic javaguidesTopic() {
        return TopicBuilder.name(topicName).build();
    }
}
