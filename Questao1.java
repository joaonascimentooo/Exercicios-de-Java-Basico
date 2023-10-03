import java.util.Scanner;
//Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//números 4, 5 e 6. A soma das duas médias. A média das médias.
public class Questao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double media1 = (8+7+9)/3.0;
        double media2 = (4+5+6)/3.0;

        double soma = media1 +media2;
        System.out.println("A soma das medias é: "+soma);

        double mediadasMedias = soma/3.0;
        System.out.println("A média das medias é igual a: "+ mediadasMedias);





    }
}
