import java.util.List;

public class RelatorioVendas extends Relatorio {
    private static final String TITULO = "Relatório de Vendas";

    public RelatorioVendas(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar() {
        gerar(true);
    }

    @Override
    public void gerar(boolean detalhado) {
        List<ItemRelatorio> itensFiltrados = filtrarItensDetalhados(detalhado);

        double total = 0;
        for (ItemRelatorio item : itensFiltrados) {
            total += item.getValor();
        }

        exportador.exportar(TITULO, itensFiltrados, total);
    }
}