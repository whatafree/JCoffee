


class c11318551 {
public static MyHelperClass d(int o0){ return null; }
//public MyHelperClass d(int o0){ return null; }

    public static int best(int r, int n, int s) {
        if ((n <= 0) || (r < 0) || (r > n) || (s < 0)) return 0;
        int[] rolls = new int[n];
        for (int i = 0; i < n; i++) rolls[i] =(int)(Object) d(s);
        boolean found;
        do {
            found = false;
            for (int x = 0; x < n - 1; x++) {
                if (rolls[x] < rolls[x + 1]) {
                    int t = rolls[x];
                    rolls[x] = rolls[x + 1];
                    rolls[x + 1] = t;
                    found = true;
                }
            }
        } while (found);
        int sum = 0;
        for (int i = 0; i < r; i++) sum += rolls[i];
        return sum;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
