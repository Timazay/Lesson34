package by.itstep.javalessons.lesson34.task01.controller;

import by.itstep.javalessons.lesson34.task01.model.entity.WeekDay;
import by.itstep.javalessons.lesson34.task01.model.entity.WeekDayType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String type = new Scanner(System.in).nextLine();
       WeekDayType dayType = WeekDayType.valueOf(type);

        System.out.println(dayType);

    }
}
