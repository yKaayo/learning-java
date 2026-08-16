package introducao_a_programacao_orientada_a_objetos.exercise03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Digite os dados do aluno");

        System.out.println("Nome: ");
        student.name = sc.nextLine();

        System.out.println();
        System.out.println("Primeira nota: ");
        student.firstGrade = sc.nextDouble();

        System.out.println();
        System.out.println("Segunda nota: ");
        student.secondGrade = sc.nextDouble();

        System.out.println();
        System.out.println("Terceira nota: ");
        student.thirdGrade = sc.nextDouble();

        System.out.println();
        System.out.println("Aluno: " + student.name);
        System.out.println("Nota final: " + student.finalGrade());

        System.out.println();
        student.isApproved();

        sc.close();
    }
}
