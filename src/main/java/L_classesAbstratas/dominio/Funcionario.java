package L_classesAbstratas.dominio;

import lombok.ToString;

@ToString
public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }


}
