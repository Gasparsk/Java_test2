package entidades;

public class ContaEspecial extends Conta {

    private double limiteEmprestimo;

    public ContaEspecial(int numero, String titular, double inicialDeposito, double limiteEmprestimo) {
        super(numero, titular, inicialDeposito);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public ContaEspecial(int numero, String titular, double limiteEmprestimo) {
        super(numero, titular);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor) {
        double taxa = 10.0;
        if (valor <= limiteEmprestimo) {
            limiteEmprestimo -= valor;
            deposito(valor - taxa);
        } else {
            System.out.println("Empréstimo não aprovado. Valor ultrapassa o limite de empréstimo.");
        }
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Limite de Empréstimo: $ " + String.format("%.2f", limiteEmprestimo);
    }
}
