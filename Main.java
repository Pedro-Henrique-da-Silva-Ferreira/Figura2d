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
        System.out.println(menu);
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
        }

        System.out.println("Digite um numero:");
        double lado = sc.nextDouble();
        Figura figura = new Quadrado(lado);

        System.out.println("Area do quadrado");
        System.out.println(figura.area());

        System.out.println("Perimetro");
        System.out.println(figura.perimetro());


    }
}