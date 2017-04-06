/* Angel Cuenca
 * Mar 2017
 *
 * Problem:
 * A flock of  birds is flying across the continent. Each bird has a type, and the different
 * types are designated by the ID numbers 1, 2, 3, 4 and 5.
 * Given an array of n integers where each integer describes the type of a bird in the flock,
 * find and print the type number of the most common bird. If two or more types of birds are
 * equally common, choose the type with the smallest ID number
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for (int types_i = 0; types_i < n; types_i++) {
            types[types_i] = in.nextInt();
        }

        //My code goes here
        //The type of birds will be the position of array + 1
        int[] typeOfBirds = new int[5];
        typeOfBirds[0] = 0;
        typeOfBirds[1] = 0;
        typeOfBirds[2] = 0;
        typeOfBirds[3] = 0;
        typeOfBirds[4] = 0;

        for(int i=0; i<n; i++){
           typeOfBirds[ types[i] - 1 ] ++;
        }

        int numberOfBirds = 0;
        int commonBird = 0;
        for(int i=4; i>=0; i--){
            if( typeOfBirds[i] >= numberOfBirds ){
                numberOfBirds = typeOfBirds[i];
                commonBird = i + 1;
            }
        }

        System.out.println(commonBird);
    }
}
