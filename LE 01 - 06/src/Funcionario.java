public abstract class Funcionario extends Pessoa {
    protected String matricula;
    protected Double salario;

    public Funcionario(String nome, String matricula){
        super(nome , "");
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void aumentarSalario(Double percentual){
        this.salario += this.salario*(percentual/100);
    }
    public abstract Double calcularRecebimentoAnual();
}
