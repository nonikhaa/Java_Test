public class Exercise_13{

    public static void main(String[] args){
        int a = 1;
        int sumResult = 0;

        while(sumResult < 1000){
           int multipleResult = a * 3;
            a = multipleResult;

            if((sumResult + a) < 1000) {
                sumResult += a;
            }
            else{
                break;
            }
        }
        System.out.println(sumResult);
    }
}