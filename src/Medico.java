public class Medico extends Funcionario {
    Procedimento procedimento;
    String especialidade;

    public Medico(String nome, String cargo, String especialidade) {
        super(nome, cargo);
        this.especialidade = especialidade;

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void realizarProcedimento(Paciente paciente, Procedimento procedimento) {
        if (getEspecialidade() != procedimento.getProcedimento()) {
            System.out.println("Este médico não possui essa especialidade");
            paciente.setStatusPosProcedimento(false);
        }

        else {
            if (procedimento.status == false) {
                System.out.println("O responsavel técnico não aprovou o procedimento");
                paciente.setStatusPosProcedimento(false);
            }

            else {
                System.out.printf
                    ("\n\nInformações:\nPaciente: %s\nProcedimento: %s\nMédico: %s\nEnfermeiro: %s",
                    paciente.getNome(),
                    procedimento.getProcedimento(),
                    getNome()
                );

                paciente.setStatusPosProcedimento(true);
            }
        }
    }

    public void realizarProcedimento(Paciente paciente, Procedimento procedimento, Enfermeiro enfermeiro) {
        if (getEspecialidade() != procedimento.getProcedimento()) {
            System.out.println("Este médico não possui essa especialidade");
            paciente.setStatusPosProcedimento(false);
        }

        else {
            
            if(procedimento.status == false) {
                System.out.println("O responsavel técnico não aprovou o procedimento");
                paciente.setStatusPosProcedimento(false);
            }

            else {
                System.out.printf
                    ("\n\nInformações:\nPaciente: %s\nProcedimento: %s\nMédico: %s\nEnfermeiro: %s",
                    paciente.getNome(),
                    procedimento.getProcedimento(),
                    getNome(),
                    enfermeiro.getNome()
                );

                paciente.setStatusPosProcedimento(true);
            }
        }
    }

    public void realizarProcedimento(Paciente paciente, Procedimento procedimento, Enfermeiro enfermeiro, Anestesista anestesista) {
        if (getEspecialidade() != procedimento.getProcedimento()) {
            System.out.println("Este médico não possui essa especialidade");
            paciente.setStatusPosProcedimento(false);
        }

        else {
            if(procedimento.status == false) {
                System.out.println("O responsavel técnico não aprovou o procedimento");
                paciente.setStatusPosProcedimento(false);
            }

            else {
                System.out.printf
                    ("\n\nInformações:\nPaciente: %s\nProcedimento: %s\nMédico: %s\nEnfermeiro: %s",
                    paciente.getNome(),
                    procedimento.getProcedimento(),
                    getNome(),
                    enfermeiro.getNome(),
                    anestesista.getNome()
                );

                paciente.setStatusPosProcedimento(true);
            }
        }
    }

    public void altaPaciente(Paciente paciente) {
        if (paciente.statusPosProcedimento == false) {
            System.out.printf("\nO médico %s não deu alta para o paciente %s", getNome(), paciente.getNome());
        }

        else {
            System.out.printf("\nO médico %s deu alta para o paciente %s", getNome(), paciente.getNome());
        }
    }
}
