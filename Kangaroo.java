/* Angel Cuenca
 * Mar 2017
 *
 * Problem:
 * There are two kangaroos on an x-axis ready to jump in the positive direction (i.e, toward positive infinity).
 * The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
 * The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
 * Given the starting locations and movement rates for each kangaroo, can you determine if they'll ever land
 * at the same location at the same time?
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        //My Code
        if(x1 == x2 && v1 == v2 ){
            System.out.println("YES");
        }else{
            if( ((x1 < x2) && (v1 <= v2)) || ((x2 < x1) && (v2 <= v1)) ){
                System.out.println("NO");
            }else{
                if( Math.abs(x2 - x1) % Math.abs(v2 - v1) == 0 ){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}
