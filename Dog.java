package com.academy;

public class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark!");
    }
    public void sit(){
        System.out.println("*sits*");
    }
}
