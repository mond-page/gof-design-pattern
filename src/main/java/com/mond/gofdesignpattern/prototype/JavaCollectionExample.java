package com.mond.gofdesignpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {
        Student mond = new Student("mond");
        Student gun = new Student("gun");
        List<Student> students = new ArrayList<>();
        students.add(mond);
        students.add(gun);

        // Prototype은 아니지만 Collection을 복사하는 방법 1
        // ArrayList는 cloneable을 상속하고 있지만, 추상타입인 List는 cloneable을 상속하지 않아 아래 방식으로 clone
        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);


    }
}
