package application;

import service.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner dg = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.println("GESTÃO DE SALÁRIOS");
        System.out.println("--------------------------");

        List<Funcionario> listaFuncionario = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados? ");
        Integer n = dg.nextInt();


        for (int i = 0; i < n; i++){
            System.out.println("CAD: " + (i + 1));
            System.out.print("ID: ");
            Integer id = dg.nextInt();
            System.out.print("Nome: ");
            dg.nextLine();
            String nome = dg.nextLine();
            System.out.print("Salário: R$ ");
            Double salario = dg.nextDouble();
            System.out.println("----------------------");

            Funcionario funcionario = new Funcionario(id,nome,salario);
            listaFuncionario.add(funcionario);
        }
        System.out.print("Digite o ID do funcionário que receberá o aumento: ");
        Integer idFuncionario = dg.nextInt();

        Funcionario funcionario = listaFuncionario.stream().filter(x -> x.getId() == idFuncionario).findFirst().orElse(null);
        //Integer pos = posicao(listaFuncionario, idFuncionario);
        if (funcionario == null){
            System.out.println("Esse Id não existe!");
        } else {
            System.out.print("Percentual de aumento: ");
            //dg.nextLine();
            double perc = dg.nextDouble();
            funcionario.aumentoSalario(perc);
        }

        System.out.println("----------------------");
        System.out.println("Lista de Funcionários:");

        for (Funcionario lista: listaFuncionario) {
            System.out.println(lista);
            System.out.println("----------------------");
            
        }


    }

    public static Integer posicao(List<Funcionario> func, int id){

        for (int i=0; i < func.size(); i++){
            if (func.get(i).getId() == id){
                return i;
            } else {
                return null;
            }
        }
        return null;
    }
}
