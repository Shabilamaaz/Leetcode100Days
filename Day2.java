//   Leetcode Problem 231 Power Of Two
public class Day2 
{
    public static void main(String[] args) {
        int n=32;
        System.out.println(isPowerOfTwo(n));
    }

    // class solution {
        public static boolean isPowerOfTwo(int n) {
            if (n < 1) {
                return false;
            } else if (n == 1) {
                return true;
            } else {
                while ((n % 2 == 0)) {
                    n = n / 2;
                }
                if (n == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
// }
