package com.mond.gofdesignpattern.flyweight;

public class FlyweightInJava {
    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf(10);
        Integer integer2 = Integer.valueOf(10);
        System.out.println(integer1 == integer2); // Caching 때문에 true

        Integer integer3 = Integer.valueOf(10000);
        Integer integer4 = Integer.valueOf(10000);
        System.out.println(integer3 == integer4); // 참조자료형 == 비교여서 false 값들의 비교는 equals 쓰기
    }
}
