// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Gerenciamento {
   public Gerenciamento() {
   }

   public static void main(String[] args) {
      System.out.println("Gerenciamento iniciado.\n");

      Procedimento procedimento = new Procedimento("Cirurgia");

      Medico medico = new Medico("Dr Carlos", "Médico" , procedimento, "Cirurgia");
      Paciente paciente = new Paciente("Fernando", "12345678910", "9999-9999");
      Enfermeiro enfermeiro = new Enfermeiro("Marcela", "Enfermeira");
      Anestesista anestesista = new Anestesista("Leando", "Anestesista");

      medico.realizarProcedimento(paciente, enfermeiro);

      medico.realizarProcedimento(paciente, enfermeiro, anestesista);

      
   }
}
