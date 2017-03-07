/* Angel Cuenca
 * Jan 2017
 *
 * Problem:
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of
 * the five integers.
 * Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 * Input Format: A single line of five space-separated integers.
 * Output Format: Print two space-separated long integers denoting the respective minimum and maximum values that can be
 *                calculated by summing exactly four of the five integers The output can be greater than 32 bit integer.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        long min = 0;
        long max = 0;

        long[] data = new long[5];
        data[0] = a;
        data[1] = b;
        data[2] = c;
        data[3] = d;
        data[4] = e;

        Arrays.sort(data);

        for(int i=0; i < 4; i++){
            min += data[i];
            max += data[i+1];
        }

        System.out.println(min + " " + max);

    }
}
