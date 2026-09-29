public class Medico extends Funcionario {
    Procedimento procedimento;
    String especialidade;

    public Medico(String nome, String cargo, Procedimento procedimento, String especialidade) {
        super(nome, cargo);
        this.procedimento = procedimento;
        this.especialidade = especialidade;

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void realizarProcedimento(Paciente paciente, Enfermeiro enfermeiro) {
        if (getEspecialidade() != procedimento.getProcedimento()) {
            System.out.println("Este médico não possui essa especialidade");

        }

        else {
            System.out.printf
            ("Informações:\nPaciente: %s\nProcedimento: %s\nMédico: %s\nEnfermeiro: %s",
                paciente.getNome(),
                procedimento.getProcedimento(),
                getNome(),
                enfermeiro.getNome()
            );
        }
        
    }
}
