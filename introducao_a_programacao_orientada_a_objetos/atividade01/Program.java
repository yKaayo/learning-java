package introducao_a_programacao_orientada_a_objetos.atividade01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Primeiro triângulo");
        System.out.println("Digite o valor do primeiro lado: ");
        x.sideA = sc.nextDouble();

        System.out.println("Digite o valor do segundo lado: ");
        x.sideB = sc.nextDouble();

        System.out.println("Digite o valor do terceiro lado: ");
        x.sideC = sc.nextDouble();

        System.out.println("Segundo triângulo");
        System.out.println("Digite o valor do primeiro lado: ");
        y.sideA = sc.nextDouble();

        System.out.println("Digite o valor do segundo lado: ");
        y.sideB = sc.nextDouble();

        System.out.println("Digite o valor do terceiro lado: ");
        y.sideC = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Área do primeiro triângulo: %.2f%n", areaX);
        System.out.printf("Área do segundo triângulo: %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A área maior é do primeiro triângulo");
        } else {
            System.out.println("A área maior é do segundo triângulo");
        }

        sc.close();
    }
}
