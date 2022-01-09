package Cod3r.RecursosHumanos;

import java.math.BigDecimal;

public class Gerente extends Empregado{
    private int contEmpregados;
    private Empregado[] subordinados;

    public Gerente(String nome, int matricula, BigDecimal salario) {
        super(nome, matricula, salario);
        this.subordinados = new Empregado[10];
        super.salario = BigDecimal.valueOf(salario.doubleValue()*1.2);
    }

    @Override
    public void trabalhar(){
        System.out.printf("O gerente %s está trabalhando...",this.getNome());
    }

    public void contratar (Empregado novoEmpregado) {
        this.subordinados[contEmpregados] = novoEmpregado;
        this.contEmpregados++;
    }

    public void demitir (int indiceEmpregado) {
        this.subordinados[indiceEmpregado] = null;
        this.contEmpregados--;
    }
}
