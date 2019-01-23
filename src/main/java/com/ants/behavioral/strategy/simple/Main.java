package com.ants.behavioral.strategy.simple;

public class Main {
    public static void main(String[] args) {
        IStrategy student = new StudentStrategy();
        Context context = new Context(student,100);
        System.out.println(context.getMethod());

    }
}
