/* Angel Cuenca
 * Feb 2017
 *
 * Problem:
 * When you select a contiguous block of text in a PDF viewer, the selection is highlighted with a blue rectangle.
 * The first line contains 26 space-separated integers describing the respective heights of each consecutive lowercase
 * English letter.
 * The second line contains a single word, consisting of lowercase English alphabetic letters.
 * Print a single integer denoting the area of highlighted rectangle when the given word is selected
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPdfViewer {

    public static void main(String[] args) {
        //Code HackerRank
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        //My Code
        int tallest = 0;
        for(int i=0; i<word.length(); i++){
            if( tallest < h[word.charAt(i) -'a'] ){
                tallest = h[word.charAt(i) -'a'];
            }
        }

        System.out.println(tallest * word.length());
    }
}
