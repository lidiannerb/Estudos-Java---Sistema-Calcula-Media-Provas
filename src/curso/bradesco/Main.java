package curso.bradesco;

public class Main {

    public static void main(String[] args) {
	  SistemaMedia joao = new SistemaMedia();
	  double media = joao.calcularMediaProvas(5,7,5.5);
	  System.out.println("A média do aluno João é: " + media);
    }
}
