public class Circulo implements Figura{
    public double raio;


    @Override
    public Double perimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(raio,2);
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
