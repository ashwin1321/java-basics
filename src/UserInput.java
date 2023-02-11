import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        System.out.println("Taking the input form the user: ");
        Scanner sc = new Scanner(System.in);

        String str =  sc.nextLine();            // nextInt, nextFloat, next
        System.out.println(str);
    }
}

