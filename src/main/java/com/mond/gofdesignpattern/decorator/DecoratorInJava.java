package com.mond.gofdesignpattern.decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponseWrapper;

public class DecoratorInJava {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(3);

        List integers = Collections.checkedList(list, Integer.class);

        list.add(3f);
        integers.add(3f);   // Error 발생 (ClassCastException)

//        HttpServletRequestWrapper httpServletRequestWrapper;
//        HttpServletResponseWrapper httpServletResponseWrapper;
    }
}
