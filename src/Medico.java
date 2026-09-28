public class Medico extends Funcionario {
    Procedimento procedimento;

    public Medico(String nome, String cargo, Procedimento procedimento) {
        super(nome, cargo);
        this.procedimento = procedimento;
    }

    public void realizarProcedimento(Paciente paciente) {
        System.out.printf("O procedimento %s no paciente %s", procedimento.getProcedimento(), paciente.getNome());
    }
}
