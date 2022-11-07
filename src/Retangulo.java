public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo() {
        altura = 0;
        largura = 0;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * altura + 2 * largura;
    }
}
