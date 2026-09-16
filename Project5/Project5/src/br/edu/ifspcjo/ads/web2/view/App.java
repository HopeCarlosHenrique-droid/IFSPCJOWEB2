package br.edu.ifspcjo.ads.web2.view;

import br.edu.ifspcjo.ads.web2.controller.EmployeesController;
import br.edu.ifspcjo.ads.web2.model.ComissionedAndSalariedEmployee;
import br.edu.ifspcjo.ads.web2.model.ComissionedEmployee;
import br.edu.ifspcjo.ads.web2.model.Employee;
import br.edu.ifspcjo.ads.web2.model.HourlyEmployee;
import br.edu.ifspcjo.ads.web2.model.SalariedEmployee;
import java.util.Scanner;

public class App {

    private static EmployeesController employeesController = new EmployeesController();
    private static Scanner scanner = new Scanner(System.in);


    public static int menu() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("----------------- Menu de Opções --------------------------");
        System.out.println("---------- 1 - Funcionario Horista ------------------------");
        System.out.println("---------- 2 - Funcionario Salariado ----------------------");
        System.out.println("---------- 3 - Funcionario Comissionado -------------------");
        System.out.println("---------- 4 - Funcionario Salariado e Comissionado -------");
        System.out.println("---------- 5 - Listar Funcionarios ------------------------");
        System.out.println("---------- 6 - Sair ---------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

        public static void main(String[] args) {
        int option;
        do {
            option = menu();
            scanner.nextLine();

            switch (option) {
                case 1:
                    hourly();
                    break;
                case 2:
                    salaried();
                    break;
                case 3:
                    comissioned();
                    break;
                case 4:
                    salariedAndComissioned();
                    break;
                case 5:
                    list();
                    break;
                case 6:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 6);
    }

    public static void hourly() {
        System.out.println("Digite o nome do funcionario: ");
        String name = scanner.nextLine();
        System.out.println("Digite o CPF do funcionario: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int numberOfHoursWorked = scanner.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        double valueOfHoursWorked = scanner.nextDouble();

        Employee employee = new HourlyEmployee(name, cpf, numberOfHoursWorked, valueOfHoursWorked);

        if (employeesController.save(employee)) {
            System.out.println("Funcionario cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar funcionario!");
        }
    }

    public static void salaried() {
        System.out.println("Digite o nome do funcionario: ");
        String name = scanner.nextLine();
        System.out.println("Digite o CPF do funcionario: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o salário: ");
        double salary = scanner.nextDouble();

        Employee employee = new SalariedEmployee(name, cpf, salary);
        if (employeesController.save(employee)) {
            System.out.println("Funcionario cadastrado com sucesso!");
        }
    }

    public static void comissioned() {
        System.out.println("Digite o nome do funcionario: ");
        String name = scanner.nextLine();
        System.out.println("Digite o CPF do funcionario: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o valor das vendas: ");
        double salesValue = scanner.nextDouble();
        System.out.println("Digite a porcentagem da comissão: ");
        double commissionPercentage = scanner.nextDouble();

        Employee employee = new ComissionedEmployee(name, cpf, salesValue, commissionPercentage);
        if (employeesController.save(employee)) {
            System.out.println("Funcionario cadastrado com sucesso!");
        }
    }

    public static void salariedAndComissioned() {
        System.out.println("Digite o nome do funcionario: ");
        String name = scanner.nextLine();
        System.out.println("Digite o CPF do funcionario: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite o valor das vendas: ");
        double salesValue = scanner.nextDouble();
        System.out.println("Digite a porcentagem da comissão: ");
        double commissionPercentage = scanner.nextDouble();
        System.out.println("Digite o salário fixo: ");
        double salary = scanner.nextDouble();

        Employee employee = new ComissionedAndSalariedEmployee(name, cpf, salesValue, commissionPercentage, salary);
        if (employeesController.save(employee)) {
            System.out.println("Funcionario cadastrado com sucesso!");
        }
    }

    public static void list() {
        System.out.println("Lista de Funcionarios:");
        for (Employee employee : employeesController.getEmployeesList()) {
            System.out.println(employee);
        }
    }
}

