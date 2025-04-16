public class Caixa extends Funcionario {
    private String horario;
    Caixa(String nome,String matricula){
        super(nome,matricula);
    }

    @Override
    public Double calcularRecebimentoAnual() {
        return salario*12;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public void mostrarDados(){
        System.out.println("Caixa: " + nome + "- Salário: R$" + salario + "- Matrícula: " + matricula + "- Horário: " + horario);
    }
}
