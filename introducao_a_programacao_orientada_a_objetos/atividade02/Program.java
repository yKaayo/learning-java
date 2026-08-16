package atividade02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        int qtd;

        System.out.println("Digite os dados do produto");
        System.out.println("Nome: ");
        product.name = sc.nextLine();

        System.out.println();
        System.out.println("Preço: ");
        product.price = sc.nextDouble();

        System.out.println();
        System.out.println("Quantidade: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Dados do produto: ");
        product.showData();

        // Add
        System.out.println();
        System.out.println("Digite o número de produtos a serem adicionados ao estoque: ");
        qtd = sc.nextInt();
        product.addProducts(qtd);

        System.out.println();
        System.out.println("Dados do produto atualizados");
        product.showData();
        // Add - End

        // Remove
        System.out.println();
        System.out.println("Digite o número de produtos a serem removidos do estoque: ");
        qtd = sc.nextInt();
        product.removeProducts(qtd);

        System.out.println();
        System.out.println("Dados do produto atualizados");
        product.showData();
        // Remove - End

        sc.close();
    }
}
