package Project1;

public class Task9 {
    public static void main(String[] args) {

        int [] arr={4,87,21,9,76,23,55};

        int a=arr[0];
        int b=arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]>a){
                b=a;
                a=arr[i];

            }else if(arr[i]>b && arr[i]!=a){
                b=arr[i];
            }
        }
        System.out.println("The second largest number is "+b);


    }
}
