package Project1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please write a number");
        int primeNumber=sc.nextInt();

        boolean isprime=true;
        for (int i=0; i<primeNumber; i++){
            if (primeNumber%2==0){
                isprime = false;
                break;
            }
        }

        if (isprime){
            System.out.println(primeNumber+" is a prime number.");
        } else{
            System.out.println(primeNumber+" is not a prime number.");
        }
    }
}
