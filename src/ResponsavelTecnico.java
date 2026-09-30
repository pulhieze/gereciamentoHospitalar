public class ResponsavelTecnico extends Funcionario {
    boolean liberacaoTecnica;
    
    public ResponsavelTecnico(String nome, String cargo, boolean liberacaoTecnica) {
        super(nome, cargo);
        this.liberacaoTecnica = liberacaoTecnica;
    }

    public boolean getLiberacaoTecnica() {
        return liberacaoTecnica;
    }

    public void setLiberacaoTecnica(boolean liberacaoTecnica) {
        this.liberacaoTecnica = liberacaoTecnica;
    }

    public void liberarProcedimento (boolean liberacaoTecnica, Medico medico) {
        if (liberacaoTecnica) {
            
        }

        else {
            System.out.println("Procedimento foi recusado pelo responsavel técnico");
        }
    }
}
