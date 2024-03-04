/* *****************************************************************************
 *  Name:              Swapnil Dekate
 *  Last modified:     March 04, 2024
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class GCD {
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        StdOut.print("Number: ");
        int p = StdIn.readInt();

        StdOut.print("Number: ");
        int q = StdIn.readInt();

        int GCD = gcd(p, q);

        StdOut.println("GCD: " + GCD);
    }
}
