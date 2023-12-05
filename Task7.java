package Project1;

public class Task7 {
    public static void main(String[] args) {

        int fib=10;
        int one=0;
        int two=1;
        int three;

        for( int i=0; i<=fib; i++){
            if (i<=1){
                three=i;
            }else{
                three=one+two;
                one=two;
                two=three;
            }
            System.out.println(three);
        }

    }
}
