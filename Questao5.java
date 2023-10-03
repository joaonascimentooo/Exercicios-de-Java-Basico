import java.util.Scanner;
// Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.
public class Questao5 {
    public static void main(String[] args) {
        int sexo, qtMulheres = 0, qtHomens = 0;
        float altura, somaHomens = 0, mediaHomens = 0, maior = 0, menor = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha o sexo da pessoa (1 p/ Homem, 2p/ Mulher)");
            sexo = entrada.nextInt();
            System.out.println("Escolha a altura da pessoa");
            altura = entrada.nextInt();

            if (sexo ==1){
                qtMulheres++;}
                else if (sexo == 2){
                    qtHomens++;
                    somaHomens = somaHomens +altura;
                } else {
                System.out.println("Sexo invalido");
            }
        }
        mediaHomens= somaHomens/qtHomens;
        System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
        System.out.println("A média de altura dos homens é " + mediaHomens + " m");
        System.out.println("O número de mulheres é " + qtMulheres);

        entrada.close();
    }
}






