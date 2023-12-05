package Project1;

public class Task3 {
    public static void main(String[] args) {

        int[][] numbers = {
                {28,30,33,67,49},
                {56,11,23,90},
                {4,88,76,41,19}
        };

        for (int i=0; i<numbers.length;i++){

            for (int j=0;j<numbers[i].length;j++){

                if (numbers[i][j]%2==0)
                    System.out.print(numbers[i][j]+" ");
            }
        }

    }
}
