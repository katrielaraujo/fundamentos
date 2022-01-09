package Cod3r.RecursosHumanos;

import java.math.BigDecimal;

public class Empregado {
    private String nome;
    private int matricula;
    protected BigDecimal salario;

    public Empregado(String nome, int matricula, BigDecimal salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.printf("%s está trabalhando... ", this.nome);
    }

    public void baterPonto() {
        System.out.printf("%s bateu o ponto", this.nome);
    }

    public String getNome() {
        return nome;
    }
}
