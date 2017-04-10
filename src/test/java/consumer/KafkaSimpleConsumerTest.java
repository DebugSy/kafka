package consumer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DebugSy on 2017/4/10.
 */
public class KafkaSimpleConsumerTest {

    public static void main(String[] args) throws  Exception{
        String broker = "127.0.0.1";
        List<String> brokers = new ArrayList<String>();
        brokers.add(broker);
        KafkaSimpleConsumer kafkaSimpleConsumer = new KafkaSimpleConsumer();
        kafkaSimpleConsumer.run(100,"symxl",0, brokers,22250);
    }

}
