/* Angel Cuenca
 * Feb 2017
 *
 * Problem:
 * HackerLand University has the following grading policy:
 * Every student receives a grade in the inclusive range from 0 to 100.
 * If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5
 * If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();

            if(grade < 38) {
                System.out.println(grade);
            }else {
                if ((nextMultiple(grade) - grade) < 3) {
                    System.out.println(nextMultiple(grade));
                } else {
                    System.out.println(grade);
                }
            }
        }

    }

    public static int nextMultiple(int grade){
        return (int)(Math.ceil(grade/5)*5)+5;
    }
}
