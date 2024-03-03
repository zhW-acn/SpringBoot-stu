package com.aca;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/03/03
 */

// 函数式接口：接口中只有一个未实现方法。default默认实现算实现了方法
@FunctionalInterface // 编译时检查接口是否符合函数式
interface MyInterface {
    int sum(int i, int j);
}

class MyInterfaceImpl implements MyInterface {
    @Override
    public int sum(int i, int j) {
        return i + j;
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        // 1.自己实现的
        MyInterface myInterface = new MyInterfaceImpl();
        myInterface.sum(1, 2);

        // 2.匿名实现类
        MyInterface myInterface1 = new MyInterface() {

            @Override
            public int sum(int i, int j) {
                return i + j;
            }
        };

        // 3.lambda
        MyInterface myInterface2 = (int i, int j) -> {
            return i + j;
        };

        // 再简化
        MyInterface myInterface3 = (i, j) -> i + j;
    }
}
