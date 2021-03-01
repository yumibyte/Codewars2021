import java.util.Scanner;
public class prob03{
    public static void main(String[] args) {


        Scanner questionThree = new Scanner(System.in);
        String intPrint = "one";

        switch(Integer.valueOf(questionThree.nextLine())) {
            case 1:
                intPrint = "one";
                break;
            case 2:
                intPrint = "two";
                break;
            case 3:
                intPrint = "three";
                break;
            case 4:
                intPrint = "four";
                break;
            case 5:
                intPrint = "five";
                break;
            case 6:
                intPrint = "six";
                break;
            case 7:
                intPrint = "seven";
                break;
            case 8:
                intPrint = "eight";
                break;
            case 9:
                intPrint = "nine";
                break;
            case 10:
                intPrint = "ten";
                break;
        }

        System.out.println("Number " + intPrint + " is alive");

    }
}
