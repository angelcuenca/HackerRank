/* Angel Cuenca
 * Mar 2017
 *
 * Problem:
 * Maria plays n games of college basketball in a season.
 * Because she wants to go pro, she tracks her points scored per game sequentially in an array
 * defined as score = [s0,s1,sn-1].
 * After each game i, she checks to see if score si breaks her record for most or least points
 * scored so far during that season.
 * The first line contains an integer denoting n (the number of games).
 * The second line contains n space-separated integers describing the respective values of s0, s1, sn-1.
 * Print two space-seperated integers describing the respective numbers of times her best (highest) score
 * increased and her worst (lowest) score decreased.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingBestAndWorstRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }

        // My code goes here
        int numberOfBestHighest = 0;
        int numberOfWorsttLowest = 0;
        int currentHighest = score[0];
        int currentLowest = score[0];

        for(int i=1; i<n; i++){
            if( score[i] > currentHighest){
                currentHighest = score[i];
                numberOfBestHighest++;
            }else if( score[i] < currentLowest ){
                currentLowest = score[i];
                numberOfWorsttLowest++;
            }
        }

        System.out.println(numberOfBestHighest + " " + numberOfWorsttLowest);
    }
}
