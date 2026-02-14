package learningJava; //PACKAGE VEM ANTES DO IMPORT

import java.util.Scanner;

public class CalendarioDia {

	public static void main(String[] args) {
		int ano, dia, mes;
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual é o ano? "); //Get the year
		ano = scan.nextInt();

		System.out.println("Qual é o dia? "); //Get the day
		dia = scan.nextInt();

		System.out.println("Qual é o mês? "); //Get the month
		mes = scan.nextInt();

		scan.close();

		/*
		 * Resultado (h),Dia da Semana
		 * 
		 * 0,Sábado 1,Domingo 2,Segunda-feira 3,Terça-feira 4,Quarta-feira
		 * 5,Quinta-feira 6,Sexta-feira
		 * 
		 */

		//Relational of leap year
		if (mes == 1) {
			mes = 13;
			ano = ano - 1;

		}

		else if (mes == 2) {
			mes = 14;
			ano = ano - 1;

		}

		int K = ano % 100; // Get the last two digits
		int J = ano / 100; // Get the first two digits
		/* Formula utilized by the Zeller's Congruence */

		int dia_semana = (dia + (13 * (mes + 1) / 5) + K + (K / 4) + (J / 4) - 2 * J) % 7;

		if (dia_semana == 0) {
			System.out.println("O dia é Sábado");
		} else if (dia_semana == 1) {
			System.out.println("O dia é Domingo");
		} else if (dia_semana == 2) {
			System.out.println("O dia é Segunda-feira");
		} else if (dia_semana == 3) {
			System.out.println("O dia é Terça-feira");
		} else if (dia_semana == 4) {
			System.out.println("O dia é Quarta-feira");
		} else if (dia_semana == 5) {
			System.out.println("O dia é Quinta-feira");
		} else {
			System.out.println("O dia é Sexta-feira");
		}

	}
}
