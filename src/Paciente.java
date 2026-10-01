public class Paciente extends Pessoa {

    private String procedimento;
    boolean statusPosProcedimento;

    public Paciente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);

    }

    // Getter

    public String getProcedimento() {
        return procedimento;    
    }

    public boolean getStatusPosProcedimento() {
        return statusPosProcedimento;
    }

    // Setter

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public void setStatusPosProcedimento(boolean statusPosProcedimento){
        this.statusPosProcedimento = statusPosProcedimento;
    } 
}
