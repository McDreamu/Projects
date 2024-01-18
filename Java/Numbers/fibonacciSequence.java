package Java.Numbers;

import java.math.BigInteger;

public class fibonacciSequence {
    public static BigInteger[] calculate(int numeroDeNumeros){
        BigInteger[] ans = new BigInteger[numeroDeNumeros];
        ans[0]=BigInteger.ZERO;
        ans[1]=BigInteger.ONE;
        for (int i = 2; i < ans.length-2; i++) {
            ans[i]=ans[i-2].add(ans[i-1]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int var=2000;
        
        BigInteger[] printer = fibonacciSequence.calculate(var);
        for (BigInteger i : printer) {
            System.out.println(i);
        }
    }
}
