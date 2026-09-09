package br.edu.ifspcjo.ads.web2.model;

public class ComissionedEmployee extends Employee {

    protected double salesValue;
    protected double commissionPercentage;
    
    public ComissionedEmployee(String name, String cpf, double salesValue, double commissionPercentage) {
        super(name, cpf);
        this.salesValue = salesValue;
        this.commissionPercentage = commissionPercentage;
    }
    
    public double getSalesValue() {
        return salesValue;
    }
    
    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }
    
    public double getCommissionPercentage() {
        return commissionPercentage;
    }
    
    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    @Override
    public String toString() {
        return "ComissionedEmployee [name=" + name + ", cpf=" + cpf + ", salesValue=" + salesValue
                + ", commissionPercentage=" + commissionPercentage + "]";
    }

    @Override
    public double calculateIncome() {
        return salesValue * commissionPercentage / 100;
    }

}
