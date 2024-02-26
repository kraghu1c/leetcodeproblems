class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (checkprime(i) == true) {
                count += 1;
            }
        }
        return count;

    }

    public static boolean checkprime(int i) {
        if(i<=1){
            return false;
        }
        if (i == 2) {
            return true;
        }
        int j = 2;
        while (j < i) {
            if (i % j == 0) {
                return false;

            }
            j += 1;
        }
        return true;

    }
}
