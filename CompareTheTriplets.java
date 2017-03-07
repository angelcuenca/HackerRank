/* Angel Cuenca
 * Jan 2017
 *
 * Problem:
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale
 * from 1 to 100 for three categories: problem clarity, originality, and difficulty.
 * We define the rating for Alice's challenge to be the triplet A=(a0, a1, a2), and the rating for Bob's challenge to be
 * the triplet B = (b0, b1, b2).
 * Your task is to find their comparison scores by comparing a0 with b0, a1 with b1, and a2 with b2.
 * If ai > bi, then Alice is awarded  point.
 * If ai < bi, then Bob is awarded  point.
 * If ai = bi, then neither person receives a point.
 *
 */
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        Map<String, Integer> data = new HashMap<>();
        data.put("a0", a0);
        data.put("a1", a1);
        data.put("a2", a2);
        data.put("b0", b0);
        data.put("b1", b1);
        data.put("b2", b2);
        
        int alice = 0;
        int bob   = 0;
        
        for(int i=0; i<3; i++){
            if(data.get("a"+i) > data.get("b"+i)){
                alice+=1;
            }else if(data.get("a"+i) < data.get("b"+i)){
                bob+=1;
            }
        }
        System.out.println(alice +" "+ bob);
    }
}
