import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();


        if (age >= 18){
            System.out.println("your adult");
        }
        else{
            System.out.println("your minor");
        }

        sc.close();
    }
    
}
