public class Funcionario extends Pessoa {
    private String nome;
    private String cargo;
    private String procedimento;

    public Funcionario(String nome, String cargo, String procedimento) {
        super(nome, "00000000000", "", 0);
        this.nome = nome;
        this.cargo = cargo;
        this.procedimento = procedimento;
    }

    // Getters
    
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public String getProcedimento() {
        return procedimento;
    }    

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }
}
