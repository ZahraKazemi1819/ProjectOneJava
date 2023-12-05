package Project1;

public class Task2 {
    public static void main(String[] args) {
        /* Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array
         */

        int [] val={4,5,8,9,2,5};

        int sum=0;

        for (int i=0; i<val.length; i++){
            sum=sum+val[i];
        }
        System.out.println(sum);


    }
}
