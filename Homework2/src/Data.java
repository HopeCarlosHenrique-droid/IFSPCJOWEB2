public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    public void setData(int dia, int mes, int ano) {

        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido: " + dia);
        }
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido: " + mes);
        }
        if (ano < 0) {
            throw new IllegalArgumentException("Ano inválido: " + ano);
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    

}
