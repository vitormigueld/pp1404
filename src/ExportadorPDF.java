import java.util.List;

public class ExportadorPDF implements Exportador{
    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO PDF ===");
        System.out.println("Título: " + titulo);
        System.out.println("Itens:");
        for (ItemRelatorio item : itens) {
            System.out.printf("- %s | R$ %.0f%n", item.getDescricao(), item.getValor());
        }
        System.out.printf("Total: R$ %.0f%n", total);
        System.out.println("======================\n");
    }
}
