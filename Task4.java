package Project1;

public class Task4 {
    public static void main(String[] args) {

        int[][] array = {
                {28,30,33,67,49},
                {56,11,23,90},
                {4,88,76,41,19}
        };

        int sum1= 0;
        int sum2= 0;

        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] % 2 == 0){
                    sum1=sum1+array[i][j];
                }else{
                    sum2=sum2+array[i][j];
                }
            }
        }

        System.out.println("Sum of even numbers: " + sum1);
        System.out.println("Sum of odd numbers: " + sum2);
    }
}
