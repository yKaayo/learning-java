package introducao_a_programacao_orientada_a_objetos.exercise02;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double porcentage) {
        grossSalary += grossSalary * porcentage / 100;
    }
}
