package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("Digite uma frase ou palavra: ");
        String input = sc.nextLine();

        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
        } 
        else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        sc.close();
    }
}