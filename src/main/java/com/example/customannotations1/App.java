package com.example.customannotations1;

import java.lang.reflect.Field;

public class App {

    public static void main(String[] args) throws IllegalAccessException {

        SomeClass someClass = new SomeClass();
        
        for (Field field : SomeClass.class.getDeclaredFields()) {
            field.setAccessible(true);
            FieldCustomValue fieldCustomValue = field.getAnnotation(FieldCustomValue.class);
            field.set(someClass, fieldCustomValue.value());
        }

        System.out.println(someClass.getLineDefault());
        System.out.println(someClass.getLineCustom());


    }
}
