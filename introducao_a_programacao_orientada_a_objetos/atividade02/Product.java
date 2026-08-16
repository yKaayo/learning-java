package atividade02;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public void showData() {
        System.out.println("Nome: " + name);
        System.out.printf("Preço: R$%.2f%n", price);
        System.out.println("Quantidade: " + quantity);
        System.out.printf("Total em estoque: R$%.2f%n", this.totalValueInStock());
    }
}
