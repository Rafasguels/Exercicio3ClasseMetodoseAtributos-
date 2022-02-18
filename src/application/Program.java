//Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
//ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam
//para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para
//resolver este problema.


package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		System.out.print("name: ");
		stu.name = sc.nextLine();
		System.out.println("Escreva as notas do aluno: ");
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", stu.notaFinal());
		
		if (stu.notaFinal() < 60.0){
				System.out.println("FAILED");
				System.out.printf("MISSING: %2f%n", stu.pontosAusente());				
		}
		else {
			System.out.println("PASS");			
		}		
		sc.close();
	}

}
