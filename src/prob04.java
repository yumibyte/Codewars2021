import java.util.Scanner;
import java.io.*;
public class prob04 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("input.txt"));//use RELATIVE paths!
            while (input.hasNextLine()) {
                double in1 = input.nextFloat();
                double in2 = input.nextFloat();
                if (in1 + in2 != 0) {

                    double j = Math.round((in1 * in2 * 10));
                    System.out.println(j / 10);
                }
            }
            input.close();

        } catch(Exception e){
            System. out.println("error: "+e.getMessage());
        }
    }
}
