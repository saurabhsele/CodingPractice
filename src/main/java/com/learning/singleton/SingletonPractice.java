package com.learning.singleton;

public class SingletonPractice {

    private static SingletonPractice object;
    private SingletonPractice(){};
    public static SingletonPractice getInstance(){
               if(object == null)
                   object = new SingletonPractice();
                   return object;
    }
}
