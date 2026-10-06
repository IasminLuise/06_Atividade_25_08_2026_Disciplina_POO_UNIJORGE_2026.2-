import java.util.Scanner;

final class Main {
    void main() {
        try {
            Scanner input = new Scanner(System.in);
            int desconto = 0;
            double preco = (double)0.0F;
            double total = (double)0.0F;
            double totalDesconto = (double)0.0F;
            double totalFinal = (double)0.0F;
            System.out.println("=========CADASTRO DE PRODUTOS=========");
            System.out.println("Selecione a quantidade de produtos: ");
            int qntd_venda = input.nextInt();

            for(int i = 0; i < qntd_venda; ++i) {
                System.out.println(i + 1 + "-Nome do Produto: ");
                String nome = input.next();
                System.out.println(i + 1 + "-Quantidade do Produto: ");
                int qntd_produtos = input.nextInt();
                System.out.println(i + 1 + "-Preço Unitário: ");
                preco = input.nextDouble();
                double subtotal = (double)qntd_produtos * preco;
                total += subtotal;
            }

            if (total <= (double)500.0F) {
                System.out.println("Sem desconto Aplicado");
                desconto = 0;
            } else if (total >= 500.01 && total <= (double)1000.0F) {
                desconto = 5;
                totalDesconto = total * 0.05;
                System.out.println("Desconto de 5% aplicado");
                totalFinal = total - totalDesconto;
            } else {
                desconto = 10;
                totalDesconto = total * 0.1;
                System.out.println("Desconto de 10% aplicado");
                totalFinal = total - totalDesconto;
            }

            System.out.println("========RESULTADO DA VENDA========");
            System.out.println("Quantidade de Vendas: " + qntd_venda);
            System.out.println("Total Bruto: " + total);
            System.out.println("Percentual do Desconto Aplicado: " + desconto);
            System.out.println("Total com Desconto: " + totalDesconto);
            System.out.println("Total Final R$" + totalFinal);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa Finalizado");
        }

    }
}
