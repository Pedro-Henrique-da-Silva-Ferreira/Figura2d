public class Quadrado implements Figura{
    public double lado;

    @Override
    public Double area() {
        return lado * lado;
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public Double perimetro() {
        return 4 * lado;
    }

    @Override
    public String nome() {
        return "Circulo";
    }

    @Override
    public int compareTo(Figura figura) {
        return area().compareTo(figura.area());
    }
}
