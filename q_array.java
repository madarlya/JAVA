import java.util.*;
public class q_array {
    public static void main(String[] args){
        
        // Take an array as input from the user. Search for a given number x and print the index at which it occurs ?

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter x");
        int x = sc.nextInt();


        for(int i = 0; i < size; i++){
            if (numbers[i] == x){
                System.out.println("the number occurs at "+ i + " index");
            }
        }
        
        // for (int i = 0; i < size; i++){
        //     System.out.println(numbers[i]);
        // }
        sc.close();
    }
}
