public class Gerente extends Funcionario {
    private Double bonificação;
    private String tipo; // só ele que pode ser PF ou PJ então é melhor ser tipo do que uma classe inteira
    public Gerente(String nome, String matricula){
        super(nome, matricula);
    }

    @Override
    public Double calcularRecebimentoAnual() {
        return (salario + bonificação)*12;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getBonificação() {
        return bonificação;
    }
    public void setBonificação(Double bonificação){
        this.bonificação = bonificação;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void mostrarDados() {
        System.out.println("Gerente: " + nome + " - Matrícula: " + matricula +
                " - Salário: R$" + salario + " - Bonificação: R$" + bonificação +
                " - Tipo: " + tipo);
    }
}
