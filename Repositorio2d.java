import java.util.ArrayList;
import java.util.List;

public class Repositorio2d {

    List<Figura> figuras = new ArrayList<>();

    public void adicionarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void removeFigura(int figura) {
        figuras.remove(figura);
    }

    public double recuperarArea(int recuperaArea) {
        Figura figura = figuras.get(recuperaArea);
        return figura.area();
    }

    public double recuperarPerimetro(int recuperaPerimetro) {
        Figura figura = figuras.get(recuperaPerimetro);
        return figura.perimetro();
    }

    public String figuraNome() {
        StringBuilder tudo = new StringBuilder();
        for (Figura figura : figuras) tudo.append(figura.nome());
        {
            return tudo.toString();
        }
    }
}
