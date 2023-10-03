import java.util.Scanner;

//Informar um saldo e imprimir o saldo com reajuste de 1%.
public class Questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite aqui o saldo");
        double saldo = entrada.nextDouble();

        double rajuste = saldo *1.01;

        System.out.println("Seu saldo é igual a: "+saldo);

    }
}
