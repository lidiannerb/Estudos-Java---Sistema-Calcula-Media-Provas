package curso.bradesco;

public class SistemaMedia {
    String aluno;
    double nota01, nota02, nota03;
    double media;

    public double calcularMediaProvas (double nota01, double nota02, double nota03){
        return (nota01 + nota02 +  nota03) / 3;
    }

}
