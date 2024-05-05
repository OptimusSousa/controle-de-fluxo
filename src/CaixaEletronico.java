public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicitado = 20.0;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso. Seu novo saldo é de R$ " + saldo);
        }
        else {
            System.out.println("Você não possue saldo para a efetivação do seu saque.");
        }
        
    }
}
