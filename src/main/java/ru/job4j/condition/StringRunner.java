package ru.job4j.condition;

public class StringRunner {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        idea = idea + " But I am a newbie. ";
        int year = 2022;
        year += 1;
        System.out.println(idea + year);
        double yearNew = 2022.0;
        yearNew++;
        System.out.println(idea + yearNew);
    }
}