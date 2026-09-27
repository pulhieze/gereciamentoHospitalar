

public class Gerenciamento {
    public static void main(String[] args) {
        // Código de gerenciamento aqui
        System.out.println("Gerenciamento iniciado.");

        Medico medico = new Medico("Dr Carlos", "Médico", "Cirurgia");
        Paciente paciente = new Paciente("Fernando", "12345678910", "Rua Fulano de tal", 99999-0000);

        System.out.println(medico.getNome());
        System.out.println(medico.getCargo());
        System.out.println(medico.getProcedimento());
        System.out.println(medico.realizarProcedimento(paciente););
    }
}