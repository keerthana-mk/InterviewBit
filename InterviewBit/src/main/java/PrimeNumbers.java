//https://www.interviewbit.com/problems/prime-sum/

public class PrimeNumbers {

    /*Use Seive of Eratostenes to get the prime numbers from 0..n(number)
     *Parse through from 0..n and check AND of n & n-i
     * */

    public void SeiveOfEratostenes(int n, boolean[] isPrime) {
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;
        for (long p = 2; p <= n; p++) {
            if (isPrime[(int) p] == true) {
                for (long i = p * p; i <= n; i = i + p) {
                    isPrime[(int) i] = false;
                }
            }
        }

    }

    public int[] primesum(int n) {
        int[] sumPrimes = new int[2];
        boolean[] isPrime = new boolean[n + 1];
        SeiveOfEratostenes(n, isPrime);
        for (int i = 0; i <= n; i++) {
            if (isPrime[i] && isPrime[n - i]) {
                sumPrimes[0] = i;
                sumPrimes[1] = n - i;
            }
        }
        return sumPrimes;
    }



    public static void main(String[] args){
        PrimeNumbers ipsum=new PrimeNumbers();
        int n=1048574;
        int[] num=ipsum.primesum(n);
        for(int i=0;i<n;i++){
        System.out.println(" sums are: "+num[i]);
        }
        System.out.println(num[0]+ "-"+num[1]);
        }
}

