import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String menu = """
                Menu
                1.Adicionar figuras
                2.Remover figuras
                3.Recuperar area
                4.Recuperar perimetro
                5.Recuperar tipo da figura""";


        Scanner sc = new Scanner(System.in);
        Repositorio2d repositorio2d = new Repositorio2d();

        System.out.println(menu);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("É um quadrado ou um circulo?");
                char resFigura = sc.next().charAt(0);

                if (resFigura == 'q') {
                    System.out.println("Digite o numero do lado do quadrado:");
                    double lado = sc.nextDouble();
                    Figura figura = new Quadrado(lado);

                    System.out.println("Area do quadrado");
                    System.out.println(figura.area());

                    System.out.println("Perimetro do quadrado");
                    System.out.println(figura.perimetro());
                    repositorio2d.adicionarFigura(figura);

                } else if (resFigura == 'c') {
                    System.out.println("Digite o numero do raio do circulo:");
                    double raio = sc.nextDouble();
                    Figura figura = new Circulo(raio);

                    System.out.println("Area do circulo");
                    System.out.printf("%.2f" , figura.area());

                    System.out.println("\nPerimetro do circulo");
                    System.out.printf("%.2f" , figura.perimetro());
                    repositorio2d.adicionarFigura(figura);
                }
                break;

            case 2:
                System.out.println("Informe o numero");
                int remover = sc.nextInt();



        }


    }
}
