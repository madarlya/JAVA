import java.util.*;
public class odd {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
        sc.close();
    }
}
