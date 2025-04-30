import java.util.Scanner;

class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;
    
    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }
    
    //Métodos da classe Cliente
    public void consultarSaldo() {
        System.out.println("Seu saldo atual: R$ " + saldo);
    } //fim do método de ConsultaSaldo
    
    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
        }
        else {
            System.out.println("Deposito inválido");
        } //fim do método depositar
    }
    
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
        else {
            System.out.println("Saldo insuficiente, valor inválido");
        } //fim do método sacar 
            } //fim da classe Cliente

public class GerenciaBanco {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome, por gentileza");
        String nome = scanner.nextLine();
        System.out.println("Informe seu sobrenome. por gentileza");
        String sobrenome = scanner.nextLine();
        System.out.println("Informe seu CPF, por gentileza");
        String cpf = scanner.nextLine();
        // Instanciando um objeto da classe Cliente
        Cliente cliente = new Cliente(nome, sobrenome, cpf);
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("Olá! Qual operação deseja realizar?");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Deposito");
            System.out.println("3 - Saque");
            System.out.println("4 - Encerrar solicitação");
            
            int escolha = scanner.nextInt();
            scanner.nextLine(); //Limpa a quebra de linha
            
            switch (escolha) {
                case 1:
                    cliente.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja depositado:");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();
                    cliente.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja sacar:");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();
                    cliente.sacar(valorSaque);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Encerrando solicitaões, até breve!");
                    break;
                default:
                    System.out.println("Opção Inválida, tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
}