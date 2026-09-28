public class Medico extends Funcionario implements Procedimento{
    public Medico(String nome, String cargo, String procedimento) {
        super(nome, cargo, procedimento);
    }

    @Override
    public void realizarProcedimento(Paciente paciente) {
        System.out.printf("O procedimento %s no paciente %s", getProcedimento(), paciente.getNome());
    }
}
