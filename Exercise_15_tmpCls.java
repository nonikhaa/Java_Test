import java.time.LocalTime;

public class Exercise_15_tmpCls{

    public void Greetings()
    {
        LocalTime timeNow = LocalTime.now();
        int hour = timeNow.getHour();

        String greet = TimeMapping(hour);
        System.out.println(greet);
    }

    public String TimeMapping(int hour)
    {
        String result = "";
        if(hour < 12)
            result = "Good Morning.";
        else if(hour >= 12 && hour <= 17)
            result = "Good Afternoon.";
        else
            result = "Good Evening.";

        return result;
    }
}