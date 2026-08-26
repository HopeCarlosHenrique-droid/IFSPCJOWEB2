import java.util.ArrayList;
import java.util.List;

public class PeopleManager {
    private List<Person> peoplelist;

    //construtor
    public PeopleManager(){
        this.peoplelist = new ArrayList<>();
    }


    // metodo para retornar a lista de pessoas
    public List<Person> getPeopleList(){
        return peoplelist;
    }

    // metodo para adicionar/salvar uma pessoa na lista
    public boolean save(Person person){
        if (person != null){
            peoplelist.add(person);
            return true;
        }
        return false;
    }
}
