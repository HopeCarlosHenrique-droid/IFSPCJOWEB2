public class App {
    public static void main(String[] args) throws Exception {
        PeopleManager manager = new PeopleManager();

        manager.save(new Person("Maria da Silva", "526.158.748-45"));

        System.out.println(manager.getPeopleList());
    }
}
