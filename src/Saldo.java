
import java.util.Random;

class Saldo {
    private double quantity;

    public Saldo() {
        initializeRandomBalance(100, 1000); // Inicializa o saldo aleatório entre 100 e 1000
    }

    public double totalValueInBalance() { // retorna o valor dentro da conta
        return quantity;
    } 

    public void initializeRandomBalance(double min, double max) {
        this.quantity = generateRandomBalance(min, max);
    }

    private double generateRandomBalance(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    public void addBalance(double amount) {
        if (amount > 0) {
            this.quantity += amount;
            System.out.printf("Adição realizada com sucesso! Novo saldo: %.2f\n", this.quantity);
        } else {
            System.out.println("A quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void removeBalance(double amount) { 
        if (amount <= 0) {
            System.out.println("A quantidade a ser removida deve ser positiva.");
        } else if (amount > this.quantity) {
            System.out.println("Saldo insuficiente para a operação.");
        } else {
            this.quantity -= amount;
            System.out.printf("Remoção realizada com sucesso! Novo saldo: %.2f\n", this.quantity);
        }
    }
}

