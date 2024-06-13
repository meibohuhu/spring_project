package net.javaguides.kafkaexample.kafka;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<Integer, String> kafkaTemplate;
//    public KafkaProducer(KafkaTemplate<Integer, String> kafkaTemplate) {
//        this.template = kafkaTemplate;
//    }

    Faker faker;

    //  Note that Flux.zip lets you combine the two Flux parameters and enables you to send your messages to the topic hobbit on Confluent Cloud.
    //  Faker.random() generates your keys and the @EventListener annotation from Spring runs the class when the application is started.
    @EventListener(ApplicationStartedEvent.class)
    public void generate() {
        faker = Faker.instance();
        final Flux<Long> interval = Flux.interval(Duration.ofMillis(1_000));
        final Flux<String>  quotes = Flux.fromStream(Stream.generate(() -> faker.hobbit().quote()));
        System.out.println("quotes are " + quotes.toString());
        Flux.zip(interval, quotes)
                .map(it -> kafkaTemplate.send("hobbit", faker.random().nextInt(42), it.getT2())).blockLast();
    }


}
