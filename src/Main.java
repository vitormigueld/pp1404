public class Main {
    public static void main(String[] args) {
        ItemRelatorio produtoA = new ItemRelatorio(50, "Produto A");
        ItemRelatorio produtoB = new ItemRelatorio(200, "Produto B");
        ItemRelatorio produtoC = new ItemRelatorio(150, "Produto C");

        System.out.println(" Financeiro | PDF | Simples");
        Relatorio c1 = new RelatorioFinanceiro(new ExportadorPDF());
        c1.adicionarItem(produtoA);
        c1.adicionarItem(produtoB);
        c1.adicionarItem(produtoC);
        c1.gerar(false);

        System.out.println(" Financeiro | Excel | Detalhado");
        Relatorio c2 = new RelatorioFinanceiro(new ExportadorExcel());
        c2.adicionarItem(produtoA);
        c2.adicionarItem(produtoB);
        c2.adicionarItem(produtoC);
        c2.gerar(true);

        System.out.println(" Vendas | PDF | Detalhado");
        Relatorio c3 = new RelatorioVendas(new ExportadorPDF());
        c3.adicionarItem(produtoA);
        c3.adicionarItem(produtoB);
        c3.adicionarItem(produtoC);
        c3.gerar(true);

        System.out.println(" Vendas | Excel | Simples");
        Relatorio c4 = new RelatorioVendas(new ExportadorExcel());
        c4.adicionarItem(produtoA);
        c4.adicionarItem(produtoB);
        c4.adicionarItem(produtoC);
        c4.gerar(false);
        }
    }
