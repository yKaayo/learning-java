package introducao_a_programacao_orientada_a_objetos.exercise03;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double finalGrade() {
        return (firstGrade + secondGrade + thirdGrade);
    }

    public void isApproved() {
        if (finalGrade() >= 60.0) {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO, faltou " + (60.0 - finalGrade()) + " pontos para ser aprovado!");
        }
    }
}
