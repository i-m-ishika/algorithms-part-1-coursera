/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int idx = 1;
        String champion = "";
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            boolean prob = StdRandom.bernoulli(1 / idx);
            if (prob) {
                champion = word;
            }
            idx++;
        }
        StdOut.println(champion);
    }
}
