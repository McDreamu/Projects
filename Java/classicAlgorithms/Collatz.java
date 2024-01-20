package Java.classicAlgorithms;

public class Collatz {
  public int conjetura(int n){
    int ans =1;
    while (n!=1) {
      if (n%2==0) {
        ans++;
        n= n/2;
        System.out.println(String.format("par %d",n));
      } else {
        n*=3;
        n++;
        n/=2;
        ans++;
        System.out.println(String.format("impar %d",n));
      }
    }
    return ans;
  }
  public static void main(String[] args) {
    Collatz collatz = new Collatz();
    int n =5;
    System.out.println(collatz.conjetura(n));
  }
}
