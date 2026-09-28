// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Gerenciamento {
   public Gerenciamento() {
   }

   public static void main(String[] args) {
      System.out.println("Gerenciamento iniciado.");

      Procedimento procedimento = new Procedimento("Cirurgia");

      Medico medico = new Medico("Dr Carlos", "Médico" , procedimento);

      Paciente paciente = new Paciente("Fernando", "12345678910", "9999-9999");

      System.out.println(medico.getNome());
      System.out.println(medico.getCargo());
      System.out.println(medico.realizarProcedimento(paciente));

      
   }
}
