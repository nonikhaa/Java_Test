import java.time.LocalTime;


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