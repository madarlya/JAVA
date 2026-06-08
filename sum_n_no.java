import java.util.*;
public class sum_n_no {
    public static void main(){
        // print the sum of first n natural numbers 

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int k = 0;

        for (int j = 1; j <= i; j++){
            k = k +j;
            
        }
        System.out.println(k);


        sc.close();
    }
}
