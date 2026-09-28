public class Paciente extends Pessoa {

    private String procedimento;

    public Paciente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
    }

    // Getter

    public String getProcedimento() {
        return procedimento;    
    }

    // Setter

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }
}
