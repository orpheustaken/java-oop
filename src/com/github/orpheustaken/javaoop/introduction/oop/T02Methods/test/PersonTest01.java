package com.github.orpheustaken.javaoop.introduction.oop.T02Methods.test;

import com.github.orpheustaken.javaoop.introduction.oop.T02Methods.domain.Person;

public class PersonTest01 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("John");
        person.setAge(-1);

        // person.print();

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
