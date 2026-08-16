package introducao_a_programacao_orientada_a_objetos.exercise01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite as medidas do retângulo");

        System.out.println("Altura: ");
        rectangle.height = sc.nextDouble();

        System.out.println();
        System.out.println("Largura: ");
        rectangle.width = sc.nextDouble();

        System.out.println("Área: " + rectangle.area());
        System.out.println("Perímetro: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());

        sc.close();
    }
}
