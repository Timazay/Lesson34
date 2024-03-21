package by.itstep.javalessons.lesson34.task01.controller;

import by.itstep.javalessons.lesson34.task01.model.entity.WeekDay;

public class Main {
    public static void main(String[] args) {
        WeekDay monday = new WeekDay();
        WeekDay friday = new WeekDay("Friday", 5);

        System.out.println(monday);
        System.out.println(friday);
    }
}
