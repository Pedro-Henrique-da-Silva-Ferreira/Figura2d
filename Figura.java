public interface Figura extends Comparable <Figura> {

    Double perimetro ();
    Double area ();
    String nome();

    int compareTo(Figura figura);
}
