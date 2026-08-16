package atividade01;

public class Triangle {
    public double sideA;
    public double sideB;
    public double sideC;

    public double area() {
        double p1 = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p1 * (p1 - sideA) * (p1 - sideB) * (p1 - sideC));
    }
}
