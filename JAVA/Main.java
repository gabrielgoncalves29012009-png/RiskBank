public class Main {

    public static void main(String[] args) {
        String nomecliente = "Gabriel";
        int idadecliente = 25;

        double salario = 5000.00;
        double dividasmensais = 500.00;
        double valorsolicitado = 1000.00;

        int quantidadeparcela = 10;

        

        
            if (salario <0) {
            System.out.println("Erro: Não foi possivel realizar o emprestimo pois seu salario e negativo");
            
        }else if (quantidadeparcela <= 0) {
            System.out.println("Erro: quantidade de parcelas inválida. Informe um número maior que zero");
            
        }else if (valorsolicitado <= 0) {
            System.out.println("Erro: o valor solicitado devera ser mais que zero");

             }else if (dividasmensais <0 ) {
            System.out.println("Erro: Não foi possivel realizar o emprestimo pois suas dividas mensais são negativa");
            
          }else if (salario <2000) {
            System.out.println("Empréstimo não autorizado: renda abaixo do valor mínimo exigido");
          

        }else if (idadecliente <18) {
            System.out.println("Emprestimo não autorizado");
        }else{
        double valorparcela = valorsolicitado /  quantidadeparcela;
        double rendacomprometida = dividasmensais + valorparcela;
        double porcentualcomprometido = (rendacomprometida / salario ) *100;

        if (porcentualcomprometido >40) {
            System.out.println("Empréstimo não autorizado: renda comprometida acima de 40%.");
        }
        else if (porcentualcomprometido >30) {
            System.out.println("Empréstimo sujeito à análise adicional");
        }
        else {
            System.out.println("Emprestimo pré Aprovado");
        }
        System.out.println("Cliente: " + nomecliente);
        System.out.println("Idade " + idadecliente +" anos");
        System.out.println("Salário: R$" +salario);
        System.out.println("Dívidas mensais: R$"+dividasmensais);
        System.out.println("Valor solicitado: R$"+valorsolicitado);
        System.out.println("Parcelas: " +quantidadeparcela);
        System.out.println("Valor da parcela: R$" +valorparcela);
        System.out.println("Valor comprometido: R$ " +rendacomprometida);
        System.out.println("Porcentual comprometido: " + porcentualcomprometido + "%");

        }
    }
}