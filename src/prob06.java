import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class prob06 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.FLOOR);

        try {
            Scanner input = new Scanner(new File("input.txt"));//use RELATIVE paths!

            while (input.hasNextLine()){
                double in1 = input.nextFloat();
                if (in1 != 0) {

                    System.out.println(df.format(Math.pow(in1, 2.0 / 3.0)));
                }
            }
            input.close();

        } catch(Exception e){
            System. out.println("error: "+e.getMessage());
        }
    }

}
