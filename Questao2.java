import java.util.Scanner;
//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

public class Questao2 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite aqui sua idade: ");
            int anos = entrada.nextInt();

            System.out.println("Digite aqui sua idade em meses: ");
            int meses = entrada.nextInt();

            System.out.println("Digite aqui sua idade em dias: ");
            int dias = entrada.nextInt();

            int idadeemDias = (anos*365) + (meses*30) + dias;

            System.out.println("A sua idade em dias é: "+idadeemDias +"dias");

        }
    }

