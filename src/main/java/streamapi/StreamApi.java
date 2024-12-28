package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
        List<String> data = List.of("Sagar","Kumar","Rachakonda");
        Stream<String> datas = data.stream();


        String[] intdata = {"1","2","3"};
        Stream<String> intdatas = Arrays.stream(intdata);

        //stream.of();
        Stream<String> Stream3 = Stream.of("CoreJava","SpringBoot","Microservices");

    }
}
