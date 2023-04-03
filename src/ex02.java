package lista02_02.src;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) throws Exception {
        int numero;
        
      Scanner reader = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = reader.nextInt();

        System.out.println("O número informado foi " + numero + " ! ");
    }
}
