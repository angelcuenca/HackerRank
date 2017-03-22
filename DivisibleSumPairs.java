/* Angel Cuenca
 * Mar 2017
 *
 * Problem:
 * You are given an array of n integers, a0, a1,.. an-1 and a positive integer, k.
 * Find and print the number of (i, j) pairs where i < j and ai + aj is evenly divisible by k.
 * The first line contains 2 space-separated integers, n and k, respectively.
 * The second line contains n space-separated integers describing the respective values of a0, a1,.. an-1.
 * Print the number of (i, j) pairs where i < j and ai + aj is evenly divisible by k.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        //My Code
        int validPairs = 0;
        int curentPosition;

        for(int i=0; i < n; i++){
            curentPosition = a[i];
            for(int j=i+1; j < n; j++){
                if( (curentPosition + a[j]) % k == 0 ){
                    validPairs++;
                }
            }
        }

        System.out.println(validPairs);
    }
}
