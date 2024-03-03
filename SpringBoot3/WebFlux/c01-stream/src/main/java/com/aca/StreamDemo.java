package com.aca;

import java.util.List;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/03/03
 */
public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1.for遍历
        int res = -1;
        for (Integer integer : list) {
            if ((integer & 1) == 0) {
                res = integer > res ? integer : res;
            }
        }
        System.out.println(res);

        // 2.stream
        list.stream()// 步骤1：获取、封装数据流。
                // 步骤2：定义流操作  intermediate operation.
                .filter(el -> el % 2 == 0)
                // 步骤3：获取结果   terminal operation.
                .max(Integer::compareTo)
                // 输出
                .ifPresent(System.out::println);


    }
}
