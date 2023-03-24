package SOMATIVA.Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {

        System.out.println("Digite o Primeiro Valor a Ser Somado");
        double val1 = sc.nextDouble();

        System.out.println("Digite o Segundo Valor a Ser Somado");
        double val2 = sc.nextDouble();

        double resultadoSoma = (val1 + val2);

        System.out.println("O Resultado da soma é: " + resultadoSoma);

    }

    public void subtracao() {

        System.out.println("Digite o Primeiro Valor a Ser Subtraido");
        double val1 = sc.nextDouble();

        System.out.println("Digite o Segundo Valor a Ser Subtraido");
        double val2 = sc.nextDouble();

        double resultadoSubtracao = (val1 - val2);

        System.out.println("O Resultado da subtração é: " + resultadoSubtracao);

    }

    public void multiplicacao() {

        System.out.println("Digite o Primeiro Valor a Ser Multiplicado:");
        double val1 = sc.nextDouble();

        System.out.println("Digite o Segundo Valor a Ser Multiplicado:");
        double val2 = sc.nextDouble();

        double resultadoMultiplicacao = (val1 * val2);

        System.out.println("O Resultado da Multiplicação é: " + resultadoMultiplicacao);
    }

    public void divisao() {
        System.out.println("Digite o Primeiro Valor a Ser Dividido");
        double val1 = sc.nextDouble();

        System.out.println("Digite o Segundo Valor a Ser Dividido");
        double val2 = sc.nextDouble();

        double resultadodivisao = (val1 / val2);

        System.out.println("O Resultado da Divisão é: " + resultadodivisao);
    }
}
