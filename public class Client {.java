public class Client {

        private int id;
        private String name;
        private String cpf;

    public Client (int id, String name, String cpf){
        
        this.id = id;
        this.name = name;
        this.cpf = cpf;

    }

    public void setId(int id){
        return id;
    }

    public void getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    @override
    public String to String(){
        return "Dados do Cliente: " +
               "\nCodigo: " + id +
               "\nNome do Cliente:" + name +
               "\nCPF: " + cpf;
    }
}
