import java.util.Scanner;
import java.io.*;
public class prob04 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("input.txt"));
            while (input.hasNextLine()){
                float num1 = input.nextFloat();
                float num2 = input.nextFloat();
                if (num1 > 0) {
                    float ans = Math.round(10 * num1 * num2) ;
                    ans = ans / 10;
                    System.out.println(ans);
                }
            }
            input.close();
        }catch(Exception e){
            System. out.println("error: "+e.getMessage());
        }
    }
}
