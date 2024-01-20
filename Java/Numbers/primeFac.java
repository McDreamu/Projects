package Java.Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primeFac {
  private static char[] factorizacion;
  public List<Integer> factorizacion(){
    List<Integer> lista = new ArrayList<Integer>();
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("ingrese el numero del que quiere obtener los numeros primos:");
      int numeroInput = input.nextInt();
      for (int i = 2; i <= numeroInput; i++) {
        while(numeroInput%i==0) {
          lista.add(numeroInput%i);
          numeroInput/=i;
        }
      }
      return lista;
    }
  }
  public static void main(String[] args) {
    System.out.println(primeFac.factorizacion);
  }
}
