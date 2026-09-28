public class Funcionario extends Pessoa {
    private String cargo;
    private Procedimento procedimento;

    public Funcionario(String nome, String cargo, Procedimento procedimento) {
        super(nome, "00000000000", "0000-0000");
        this.cargo = cargo;
        this.procedimento = procedimento;
    }

    // Getters

    public String getCargo() {
        return cargo;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }    

    // Setters

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }
}
