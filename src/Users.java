import java.util.HashMap;
import java.util.Map;

class Users {
    private Map<Integer, String> usuarios; // mapeia ID do usuário para nome
    private Map<Integer, String> senhas; // mapeia ID do usuário para senha
    private Map<Integer, Saldo> saldos; // mapeia ID do usuário para saldo

    public Users() {
        usuarios = new HashMap<>();
        senhas = new HashMap<>();
        saldos = new HashMap<>();

        // Inicializando usuários e senhas
        usuarios.put(1, "Stephen L. Ballard");
        senhas.put(1, "12345678");
        saldos.put(1, new Saldo()); // Adiciona saldo para o usuário 1

        usuarios.put(2, "Douglas W. Moore");
        senhas.put(2, "12345678");
        saldos.put(2, new Saldo()); // Adiciona saldo para o usuário 2

        usuarios.put(3, "Jack Cudmore");
        senhas.put(3, "12345678");
        saldos.put(3, new Saldo()); // Adiciona saldo para o usuário 3

        usuarios.put(4, "Caio Fernandes Ribeiro");
        senhas.put(4, "00000");
        saldos.put(4, new Saldo()); // Adiciona saldo para o usuário 4

        usuarios.put(5, "Kasper S. Nielsen");
        senhas.put(5, "182118");
        saldos.put(5, new Saldo()); // Adiciona saldo para o usuário 5
    }

    public boolean containsKey(int key) {
        return usuarios.containsKey(key);
    }

    public String getUsuario(int key) {
        return usuarios.get(key);
    }

    public String getSenha(int key) {
        return senhas.get(key);
    }

    public Saldo getSaldo(int key) {
        return saldos.get(key);
    }
}
