public class Main {

    public static void main(String[] args) {
        // 1. Declaração de Variáveis
        String nome;
        int idade;
        double salarioBrutoMensal;
        int mesesTrabalhados;
        int quantidadeProdutosComprados;

        // 2. Atribuição de Valores
        nome = "Carlos"; // Exemplo de nome
        idade = 30; // Exemplo de idade
        salarioBrutoMensal = 3000.00; // Exemplo de salário bruto mensal em reais
        mesesTrabalhados = 12; // Exemplo de meses trabalhados em um ano
        quantidadeProdutosComprados = 50; // Exemplo de quantidade de produtos comprados

        // 3. Operações Simples
        double salarioAnualBruto = salarioBrutoMensal * mesesTrabalhados; // Salário anual bruto
        double desconto = 2000.00; // Exemplo de desconto fixo
        double salarioAnualLiquido = salarioAnualBruto - desconto; // Salário anual líquido

        double valorTotalCompras = 5000.00; // Exemplo de valor total de compras
        double mediaValorPorProduto = valorTotalCompras / quantidadeProdutosComprados; // Média do valor gasto por produto

        String mensagem = "O salário anual líquido de " + nome + " é R$ " + salarioAnualLiquido + "."; // Mensagem personalizada

        // 4. Exibição de Resultados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Bruto Mensal: R$ " + salarioBrutoMensal);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Quantidade de Produtos Comprados: " + quantidadeProdutosComprados);
        System.out.println("Salário Anual Bruto: R$ " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido: R$ " + salarioAnualLiquido);
        System.out.println("Média do Valor por Produto: R$ " + mediaValorPorProduto);
        System.out.println(mensagem);
    }
}
