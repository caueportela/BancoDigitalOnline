import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class BancoDigital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Users user = new Users();

        System.out.println("Bem-vindo ao Banco Digital");
        System.out.println("Qual é seu usuário? (Digite o número de 1 a 5)");

        int cn = sc.nextInt();
        if (user.containsKey(cn)) {
            System.out.println("Digite sua senha, senhor " + user.getUsuario(cn));
            String senhaDigitada = sc.next(); // pega a senha 

            if (senhaDigitada.equals(user.getSenha(cn))) { // verifica se a senha é correta
                System.out.println("Acesso concedido!");

            
                Saldo usuarioSaldo = user.getSaldo(cn); // exibe o saldo do usuário
                System.out.printf("Seu saldo atual é: %.2f\n", usuarioSaldo.totalValueInBalance());

           
                System.out.println("Digite um valor para depositar ao saldo:");
                double addAmount = sc.nextDouble();
                usuarioSaldo.addBalance(addAmount);

                System.out.println("Digite um valor para sacar do saldo:");
                double removeAmount = sc.nextDouble();
                usuarioSaldo.removeBalance(removeAmount);
                
            } else {
                System.out.println("Senha incorreta.");
            }
        } else {
            System.out.println("Digite um usuário válido, por favor.");
        }

        sc.close(); 
    }
}