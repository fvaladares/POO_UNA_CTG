import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Por favor, infore a largura do retângulo");
        retangulo.setLargura(reader.nextDouble());
        System.out.println("Por favor, infore a altura do retângulo");
        retangulo.setAltura(reader.nextDouble());

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
    }
}