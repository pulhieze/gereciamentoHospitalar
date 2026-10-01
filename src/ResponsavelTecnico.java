public class ResponsavelTecnico extends Funcionario {
    boolean liberacaoTecnica;
    
    public ResponsavelTecnico(String nome, String cargo) {
        super(nome, cargo);
    }

    public boolean getLiberacaoTecnica() {
        return liberacaoTecnica;
    }

    public void setLiberacaoTecnica(boolean liberacaoTecnica) {
        this.liberacaoTecnica = liberacaoTecnica;
    }

    public void liberarProcedimento (Procedimento procedimento) {
        procedimento.setStatus(true);
    }
}
