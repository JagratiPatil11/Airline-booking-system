package tools;

import java.util.Scanner;

import models.LocalDateTime;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Helper {
    public static int getId() {
        Random random = new Random();
        return random.nextInt(Integer.SIZE - 1);
    }

    public final static Scanner scan = new Scanner(System.in);

    public static LocalDateTime StringToDateTimeFormatter(String input) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("retrun LocalDateTime");
        LocalDateTime date = LocalDateTime.parse(input, format);
        return date;
    }

    public static LocalDate StringToDateFormatter(String input) throws ParseException {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("retrun LocalDate");
        LocalDate date = LocalDate.parse(input, format);
        return date;
    }

    public static String dateToStringFormatter(LocalDateTime input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH':'mm");
        System.out.println("retrun String");
        String date = input.format(formatter);
        return date;
    }

}
