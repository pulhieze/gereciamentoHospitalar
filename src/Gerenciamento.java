// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Gerenciamento {
   public Gerenciamento() {
   }

   public static void main(String[] args) {
      System.out.println("Gerenciamento iniciado.\n");

      ResponsavelTecnico responsavelTecnico = new ResponsavelTecnico("Almir", "Responsavel Técnico");

      // Procedimento 1

      Procedimento procedimento = new Procedimento("Cirurgia");
      Medico medico = new Medico("Dr Carlos", "Médico" , "Cirurgia");
      Paciente paciente = new Paciente("Fernando", "12345678910", "9999-9999");
      Enfermeiro enfermeiro = new Enfermeiro("Marcela", "Enfermeira");
      Anestesista anestesista = new Anestesista("Leando", "Anestesista");
      
      responsavelTecnico.liberarProcedimento(procedimento);

      medico.realizarProcedimento(paciente, procedimento, enfermeiro, anestesista);
      medico.altaPaciente(paciente);

      // Procedimento 2

      Medico medico2 = new Medico("Dra Priscyla", "Médico", "Cirurgia Estética");
      Procedimento procedimento2 = new Procedimento("Cirurgia Estética");
      Paciente paciente2 = new Paciente("Luisa", "10987654321", "0000-0000");
      Enfermeiro enfermeiro2 = new Enfermeiro("Helena", "Enfermeira");

      responsavelTecnico.liberarProcedimento(procedimento2);
      
      medico2.realizarProcedimento(paciente2, procedimento2, enfermeiro2);
      medico2.altaPaciente(paciente2);
   }
}
