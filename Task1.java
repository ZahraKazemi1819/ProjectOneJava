package Project1;

public class Task1 {
    public static void main(String[] args){
        int [] temp = {25,10,37,42,28,2,6}; //Celsus degree

        int highest=temp[0];
        int lowest= temp[0];

        for (int t=0; t<temp.length; t++){
            if (highest<temp[t]){
                highest=temp[t];
            }
            if (lowest>temp[t]){
                lowest=temp[t];
            }
        }
        System.out.println("The highest temperature for this week is "+highest);
        System.out.println("The lowest temperature for this week is "+lowest);

    }
}
