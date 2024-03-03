package com.aca;

import org.apache.logging.log4j.spi.ObjectThreadContextMap;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/03/03
 */
public class FunctionDemo {

    public static void main(String[] args) {
//
//        // 有入无出【消费者】
//        //void accept(T t, U u);
//        BiConsumer<String, String> biConsumer = (a, b) -> {
//            System.out.println(a + b);
//        };
//        biConsumer.accept("1", "2");
//
//        // 有入有出【多功能函数】
//        // R apply(T t);
//        Function<String, Integer> function = (String x) -> Integer.parseInt(x);
//        System.out.println(function.apply("2"));
//
//        // 无入无出【普通函数】
//        Runnable runnable = () -> System.out.println("aaa");
//        new Thread(runnable).start();
//
//        // 无入有出【提供者】
//        Supplier<String> supplier = ()-> UUID.randomUUID().toString();
//        String s = supplier.get();
//        System.out.println(s);

        // 定义数据提供者
        Supplier<String> supplier = () -> "128";
        // 断言是否是数字
        Predicate<String> isNum = str -> str.matches("-?\\d+(\\.\\d+)?");
        // 把字符串变为数字
        Function<String, Integer> changeStr = Integer::parseInt;
        // 消费数据，判断数字是否为偶数
        Consumer<Integer> consumer = num -> {
            System.out.println(num % 2 == 0);
        };

        // 使用
//        if (isNum.test(supplier.get())) {
//            consumer.accept(changeStr.apply(supplier.get()));
//        }


        // 封装
        method(() -> "21a",
                str -> str.matches("-?\\d+(\\.\\d+)?"),
                Integer::parseInt,
                num -> {
                    System.out.println(num % 2 == 0 ? "even" : "odd");
                }
        );
    }

    private static void method(Supplier<String> supplier,
                               Predicate<String> isNum,
                               Function<String, Integer> changeStr,
                               Consumer<Integer> consumer) {
        if (!isNum.test(supplier.get())) {
            System.out.println("NAN");
        } else {
            consumer.accept(changeStr.apply(supplier.get()));
        }
    }

    // 创建流
    private static void createStream() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Stream<Integer> concat = Stream.concat(Stream.of(3, 4, 5), stream);
        Stream.builder().add("1").add("2");

        // Collection
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        Set<Integer> s = Set.of(1, 2, 3, 4, 5);
        Map<Object, Object> m = Map.of("k1","v1");
        m.keySet().stream();
        m.values().stream();
    }


}
