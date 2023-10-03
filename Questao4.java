import java.util.Scanner;
//Escreva um programa que, com base em uma temperatura em graus celsius, a converta e
// exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
// F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67


public class Questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite aqui um valor em celsius: ");
        float celsius = entrada.nextFloat();

        double farenheit = celsius* 1.8 +32;
        double kelvin = celsius +273.15;
        double rankine = celsius * 1.8 +32 +459.67;
        double reaumur = celsius * 0.8;

        System.out.println("O valor de celsius em farenheit: "+farenheit);
        System.out.println("O valor de celsius em kelvin: "+kelvin);
        System.out.println("O valor de celsius em rankine:"+rankine);
        System.out.println("O valor de celsius em reaumur: " +reaumur);



    }
}
