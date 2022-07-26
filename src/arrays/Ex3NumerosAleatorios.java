package arrays;

import java.util.Random;

public class Ex3NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros Aleatorios:");
        for (int numero: numerosAleatorios) {
            System.out.println(numero + " ");

        }

        System.out.print("\nAntecessor dos Numeros Aleatorios:");
        for (int numero : numerosAleatorios){
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\nsucessores dos Numeros Aleatorios:");
        for (int numero : numerosAleatorios){
            System.out.print((numero + 1) + " ");
        }

    }
}
