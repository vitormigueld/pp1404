
import java.util.ArrayList;
import java.util.List;

public abstract class Relatorio {
    protected Exportador exportador;
    protected List<ItemRelatorio> itens;

    public Relatorio(Exportador exportador) {
        this.exportador = exportador;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemRelatorio item) {
        this.itens.add(item);
    }

    protected double calcularTotal() {
        return itens.stream().mapToDouble(ItemRelatorio::getValor).sum();
    }

    protected List<ItemRelatorio> filtrarItensDetalhados(boolean detalhado) {
        if (detalhado) {
            return itens;
        }

        List<ItemRelatorio> filtrados = new ArrayList<>();
        for (ItemRelatorio item : itens) {
            if (item.getValor() >= 100) {
                filtrados.add(item);
            }
        }
        return filtrados;
    }

    public abstract void gerar();
    public abstract void gerar(boolean detalhado);
}