package SOMATIVA.Exercicio3º;

import java.util.Scanner;

public class Exercicio3 {
    Scanner sc = new Scanner(System.in);

    void Exercicio3º() {

    System.out.println("Quatos kg de MORANGOS vai querer?");
    double qMorangoKg = sc.nextDouble();

    double pMorangoTotal = qMorangoKg*15;
    double pFinalMorango = pMorangoTotal;
    if (pFinalMorango >=25 ) {
        pMorangoTotal = pFinalMorango*0.10 ;
    }
    System.out.println("Total a pagar pelos morango "+pMorangoTotal);
}
    System.out.println("Quatos kg de MAÇANS vai querer?");
    double qMaçansKg = sc.nextDouble();

    double pMaçansTotal = qMaçansKg*15;
    double pFinalMaçans = pMaçansTotal;
    if (pFinalMaçans >=25 ) {
        pMaçansTotal = pFinalMaçans*0.10 ;
    }
    System.out.println("Total a pagar pelos morango "+pMorangoTotal);

    System.out.println("Quatos kg de BANANAS vai querer?");
    double qBananasKg = sc.nextDouble();

    double pBananasTotal = qBananasKg*15;
    double pFinalBananas = pBananasTotal;
    if (pFinalBananas >=25 ) {
        pBananasTotal = pFinalBananas*0.10 ;
    }
    System.out.println("Total a pagar pelos morango "+pMorangoTotal);
}
