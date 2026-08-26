public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client(1, "Carlos Henrique", "1234");
        BankAccount account = new BankAccount(1, client, 800);
        System.out.println(account);
       
       
        /*account.displayDetails();
        account.setId(2);
        account.setClientName("Carlos Henrique");
        System.out.println("Código: " + account.getId());
        System.out.println("Nome do Cliente: " + account.getClientName());
        System.out.printf("Saldo: R$ %.2f%n%n", account.getBalance());
        account.deposit(1000);
        account.displayDetails();
        account.withdraw(500);
        account.displayDetails();

        BankAccount account2 = new BankAccount(3, "Maria", 0);
        account2.setClientName("Maria Silva");
        account2.deposit(300);
        account2.displayDetails();
        System.out.println(account2);*/
    }
}
