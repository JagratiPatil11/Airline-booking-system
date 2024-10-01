package tools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.google.gson.Gson;

import controllers.BookingController;
import models.Flight;
import models.Ticket;

public class Storage {
    public static BookingController loadData() {
        BookingController controller = new BookingController();
        try {
        	System.out.println("Before reader");
            BufferedReader reader = new BufferedReader(new FileReader("data.json"));
            System.out.println("2");
            /* String */
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            System.out.println("3");
            String ls = System.getProperty("line.separator");
            System.out.println("4");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            System.out.println("5");
            // delete the last new line separator
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            System.out.println("6");
            reader.close();

            System.out.println("7");
            String content = stringBuilder.toString();
            System.out.println("content is " +content);
            Gson gson = new Gson();
            System.out.println("8");
            BookingController2 controller2 = gson.fromJson(content, BookingController2.class);
            System.out.println("8.1");
            controller = gson.fromJson(content, BookingController.class);
            System.out.println("9");

        } catch (Exception e) {
        	System.out.println("In catch block");
            System.out.println(e);
        }

        return controller;
    }

    public static boolean savingData(String data) {
        try {
            FileWriter fw = new FileWriter("data.json");
            fw.write(data);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}

class BookingController2 {
    
}
