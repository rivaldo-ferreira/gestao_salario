package service;

public class Funcionario {

    private Integer Id;
    private String nome;
    private Double salario;

    public Funcionario(){}

    public Funcionario(Integer id, String nome, Double salario) {
        Id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return Id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentoSalario(double percentual){
        this.salario += salario *  percentual / 100;
    }

    public String toString(){
        return "ID: " + Id +
                "\nNome: " + nome.toUpperCase() +
                "\nSalário: " + String.format("%.2f",salario);
    }
}
