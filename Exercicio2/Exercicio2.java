package SOMATIVA.Exercicio2;

public class Exercicio2 {
    
    public void Exercicio2() {
        System.out.println("Digite o numero de Matricula do Aluno de 1 a 324:");
        double nMatricula = sc.nextDouble();

        if (nMatricula >= 1 && nMatricula <= 908) {
            System.out.println("Time do Chris");
        } else if (nMatricula >= 23 && nMatricula <= 124) {
            System.out.println("Time do Greg");
        } else if (nMatricula >= 67 && nMatricula <= 324) {
            System.out.println("Time do Caruso");
        } else if (nMatricula >= 38 && nMatricula <= 234) {
            System.out.println("Time do Jerome");
        } else {
            System.out.println("Erro Digite Tente Novamente BURRO");
        }

    }
}
