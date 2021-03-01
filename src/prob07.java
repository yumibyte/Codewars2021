
import java.util.Scanner;
import java.io.*;

public class prob07 {

    public static void main(String[] args) {
        int lonely = 0;
        int duplicates = 0;
        int none = 0;
        try {
            Scanner input = new Scanner(new File("input.txt"));//use RELATIVE paths!

            while (input.hasNextLine()){
                int n = input.nextInt();

                String[] names = new String[n];
                int[] nums = new int[n];

                for (int i = 0; i < n; i ++) {
                    names[i] = input.next();
                    nums[i] = input.nextInt();
                }

                for (int j = 0; j < n; j ++) {
                    if (names[j].equals("Lonely")) {
                        lonely ++;
                    }
                    for (int k = j + 1; k < n; k ++) {
                        if (nums[j] == nums[k] && nums[j] != 0) {
                            duplicates ++;
                        }
                    }
                    if (nums[j] == 0) {
                        none ++;
                    }

                }


            }


            input.close();

        } catch(Exception e){
            System. out.println("error: "+e.getMessage());
        }

        System.out.println("Lonely Cubes: " + lonely +
                "\nDuplicate Cube Assignments: " + duplicates +
                "\nTest Subjects without Cubes: " + none);
    }

}


