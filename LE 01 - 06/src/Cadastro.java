public class Cadastro {
    public static void main(String[] args) {
        // Criar um funcionário caixa
        Caixa caixa = new Caixa("João Silva", "CX123");
        caixa.setHorario("08:00-17:00");
        caixa.setTelefone("(11) 9999-8888");
        caixa.setSalario(2500.00);

        // Aumentar salário em 10%
        caixa.aumentarSalario(10.0);

        // Mostrar dados do caixa
        caixa.mostrarDados();
        System.out.println("Recebimento anual: R$" + caixa.calcularRecebimentoAnual());
        System.out.println();

        // Criar um funcionário gerente
        Gerente gerente = new Gerente("Maria Souza", "GR456");
        gerente.setTelefone("(11) 98888-7777");
        gerente.setSalario(5000.00);
        gerente.setBonificação(1000.00);
        gerente.setTipo("PF");

        // Aumentar salário em 20%
        gerente.aumentarSalario(20.0);

        // Mostrar dados do gerente
        gerente.mostrarDados();
        System.out.println("Recebimento anual: R$" + gerente.calcularRecebimentoAnual());
        System.out.println();

        // Criar 3 instâncias de cliente
        Cliente cliente1 = new Cliente(35,"123.456.789-00","(11) 97777-6666","Carlos Oliveira");
        Cliente cliente2 = new Cliente(28, "987.456.321-00", "(62) 9988-5324", "Ana Pauleira");
        Cliente cliente3 = new Cliente(42, "569.874.123-00", "(61) 8002-8922", "Yudi DoPs2");

        // Desativar um dos clientes
        cliente2.Desativar();

        // Mostrar dados dos clientes
        cliente1.mostrarDados();
        cliente2.mostrarDados();
        cliente3.mostrarDados();
    }
}