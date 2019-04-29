import java.util.Arrays;

public class Exercise_12{

    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,3,5,7,9};
        int[] arr3 = new int[3];
        int a = 0;

        for (int data : arr1) {
            for (int detail : arr2) {
                if(data == detail)
                {
                    arr3[a] += data;
                    a++;
                }
            }
        }

        System.out.println(Arrays.toString(arr3)); 
    }
}