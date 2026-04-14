import java.util.List;

public class ExportadorExcel implements Exportador{
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO EXCEL ===");
        System.out.println("[" + titulo + "]");
        System.out.println("descricao;valor");
        for (ItemRelatorio item : itens) {
            System.out.printf("%s;%.0f%n", item.getDescricao(), item.getValor());
        }
        System.out.printf("TOTAL;%.0f%n", total);
        System.out.println("======================\n");
    }
}
