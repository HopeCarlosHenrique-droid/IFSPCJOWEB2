public class BankAccount {

    //declaracao de atributos / variaveis de instancia
    private int id;
    private Client client;
    private double balance;

    //metodo construtor 
    public BankAccount(int id, Client client, double balance) {
        this.id = id;
        this.client = client;
        this.balance = balance;
    }

    //metodos acessadores 
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setClientName(Client client) {
        this.client = client;
    }

    public Client getClientName() {
        return client;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0){
            return;
        }
        if (balance >= amount) {
             balance -= amount;
        }
    }
    
    @Override
    public String toString() {
        return 
          "Dados da Conta: " +
          "\nCódigo: " + id +
          "\nNome do Cliente: " + client.getName() +
          "\nSaldo: R$ " + balance;
    }

    public void displayDetails() {
        System.out.println("Dados da conta: ");
        System.out.println("Codigo: " + id);
        System.out.println("Nome do Cliente: " + client.getName());
        System.out.println("Saldo: R$ " + balance);
    }
}
