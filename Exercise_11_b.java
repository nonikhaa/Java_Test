import java.lang.*;

public class Exercise_11_b{
    public static void main(String[] args){
        String ac = "Hello World";
        
        String[] arr = ac.split("");

        for (String data : arr) {
            System.out.println(data);
        }
    }
}
