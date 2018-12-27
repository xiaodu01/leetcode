public class CountPrimes {
    
    public static int countPrimes(int n) {
        if (n <= 1)
            return 0;
        boolean[] isPrime = new boolean[n];
        isPrime[0]=true;
        isPrime[1]=true;
        for (int i = 2; i*i < n; i++) {
            if (!isPrime[i]) {
                for (int j = i * 2; j < n; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        
        int result = 0;
        for (boolean b : isPrime) {
            if (!b)
                result++;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    
}