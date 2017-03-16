/* Angel Cuenca
 * Mar 2017
 *
 * Problem:
 * Consider two sets of positive integers. We say that a positive integer x is between
 * sets A and B if the following conditions are satisfied:
 * All elements in A are factors of x.
 * x is factor of all elements in B.
 * The first line contains two space-separated integers describing the respective values
 * of n (the number of elements in set A) and m (the number of elements in set B).
 * The second line contains n distinct space-separated integers describing a0, a1, an-1.
 * The third line contains m distinct space-separated integers describing b0, b1, bn-1.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];

        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }

        //My Code
        int numberBetween = 0;
        int maxArrayPosition = (n > m) ? n : m;

        for(int i=a[n-1]; i <= b[m-1]; i++){
            boolean listAFactorsOfX = true;
            boolean xFactorOflistB = true;

            for(int array=0; array < maxArrayPosition; array++){
                if(n > array){
                    if(i % a[array] != 0){
                        listAFactorsOfX = false;
                        break;
                    }
                }

                if( listAFactorsOfX ){
                    if( m > array ){
                        if(b[array] % i != 0){
                            xFactorOflistB = false;
                            break;
                        }
                    }
                }
            }

            if( xFactorOflistB && listAFactorsOfX ){
                numberBetween++;
            }
        }

        System.out.println(numberBetween);
    }

}
