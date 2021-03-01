import java.util.Scanner;

public class prob05 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);//use RELATIVE paths!
            int a = Integer.valueOf(input.nextLine());
            int b = Integer.valueOf(input.nextLine());
            int c = Integer.valueOf(input.nextLine());

            System.out.println(a + " * (" + b + " + " + c + ") = " + a + " * " + b + " * " + c);
            System.out.println(a + " * " + b + " = " + a * b + " + " + a * c);
            System.out.println(a * (b + c) + " = " + a * (b + c));
        } catch(Exception e) {

        }
    }
}
