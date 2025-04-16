public class Cliente extends Pessoa {
    private int idade;
    private String cpf;
    private char status; // A para ativo e I para inativo
    public Cliente(int idade, String cpf, String telefone, String nome){
        super(nome, telefone);
        this.idade = idade;
        this.cpf = cpf;
    }
    public void Desativar(){
        if (status == 'A') {
            status = 'I';
        } else {
            System.out.println("Cliente já é Inativo");
        }
    }
    public void mostrarDados(){
        String statusStr = (status == 'A') ? "Ativo" : "Inativo";
        System.out.println(nome + " - Tel:" + telefone + " - idade: " + idade +
                " anos - cpf: " + cpf + " - " + statusStr);
    };
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}

