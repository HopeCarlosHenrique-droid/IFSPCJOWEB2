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

    public Person search(String cpf){
        for(Person person : peoplelist){
            if(person.getCpf().equals(cpf)){
                return person;
            }
        }
        return null;
    }

    public boolean update(String nome, String cpf){
        Person person = search(cpf);
        if(person != null){
            int index = peoplelist.indexOf(person);
            if(index != -1){
                person.setName(nome);
                peoplelist.set(index, person);
                return true;
            }
        }
    
    return false;
    }

    public boolean delete(String cpf){
        Person person = search(cpf);
        if (person != null) {
            peoplelist.remove(person);
            return true;
        }

        return false;
    }

    public void list(String nome){
        for (Person person : peoplelist) {
            System.out.println(person.getName());
        }
    }
}
