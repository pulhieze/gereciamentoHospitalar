public class Paciente extends Pessoa {

    private String procedimento;

    public Paciente(String nome, String cpf, String endereco, int telefone) {
        super(nome, cpf, endereco, telefone);
        this.procedimento = procedimento;
    }

    // Getter

    public String getProcedimento() {
        return procedimento;    
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }
}
