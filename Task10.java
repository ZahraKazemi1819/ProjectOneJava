package Project1;

public class Task10 {
    public static void main(String[] args) {
        String[] names={"Lea","Marie","Zainab","Roya","Amena","Sadaf","Marie"};

        for (int i=0; i<names.length; i++){

            for (int j=i+1; j<names.length; j++){

                if (names[i].equals(names[j])){
                    System.out.println(names[i]);
                }
            }
        }
    }
}
