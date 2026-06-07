import java.util.Scanner;
public class input{

    public static void main(String[] args){
        System.out.println("hii");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.println("Hello " + name);

        sc.close();
        
    }

}