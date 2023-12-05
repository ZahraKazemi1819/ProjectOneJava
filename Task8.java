package Project1;

public class Task8 {
    public static void main(String[] args) {

        int [] array= {34,67,2,45,10,89};

        int max=array[0];
        int min=array[0];

        for (int z=0; z<array.length; z++){
            if ( max<array[z]){
                max=array[z];
            }
            if ( min>array[z]){
                min=array[z];
            }
        }
        System.out.println("The maximum number in this array is "+max);
        System.out.println("The minimum number in this array is "+min);
    }
}
