package introducao_a_programacao_orientada_a_objetos.exercise02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Digite os dados do funcionário");

        System.out.println("Nome: ");
        employee.name = sc.nextLine();

        System.out.println();
        System.out.println("Salário bruto: ");
        employee.grossSalary = sc.nextDouble();

        System.out.println();
        System.out.println("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Digite a porcentagem para aumentar o salário bruto: ");
        double porcentage = sc.nextDouble();
        employee.increaseSalary(porcentage);

        System.out.println();
        System.out.println("Nome: " + employee.name);
        System.out.printf("Salário líquido: $%.2f%n", employee.netSalary());

        sc.close();
    }
}
