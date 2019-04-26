import java.lang.*;
import java.lang.Integer;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import javax.lang.model.util.ElementScanner6;


public class Exercise_14{

    public static void main(String[] args){
        LocalTime timeNow = LocalTime.now();

        int hour = timeNow.getHour();

        if(hour < 12)
            System.out.println("Good Morning.");
        else if(hour >= 12 && hour <= 17)
            System.out.println("Good Afternoon.");
        else
            System.out.println("Good Evening.");
    }
}