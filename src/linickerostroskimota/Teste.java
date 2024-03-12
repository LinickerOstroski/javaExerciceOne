package linickerostroskimota;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Digite o nome do Paciente:");
        String nomePaciente1 = scanner.nextLine();
        System.out.println("Digite o cpf:");
        String cpf1 = scanner.nextLine();
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        Internacao internacao1 = new Internacao();

        Paciente paciente1 = new Paciente(nomePaciente1, cpf1, idade);
        
        Scanner scanner2 = new Scanner(System.in);
        
       
        System.out.println("Digite o nome do Medico:");
        String nomeMedico1 = scanner2.nextLine();
        System.out.println("Digite o cpf:");
        String cpf2 = scanner2.nextLine();
        System.out.println("Digite a idade:");
        int idade2 = scanner2.nextInt();

        Medico medico1 = new Medico(nomeMedico1, cpf2, idade2);

        Scanner scanner3 = new Scanner(System.in);
        
        System.out.println("Digite o nome do Enfermeiro:");
        String nomeEnfermeiro1 = scanner3.nextLine();
        System.out.println("Digite o cpf:");
        String cpf3 = scanner3.nextLine();
        System.out.println("Digite a idade:");
        int idade3 = scanner3.nextInt();

        Enfermeiro enfermeiro1 = new Enfermeiro(nomeEnfermeiro1, cpf3, idade3);

         Scanner scanner4 = new Scanner(System.in);
        
        System.out.println("Digite o motivo da internação:");
        String motivo = scanner4.nextLine();
        System.out.println("Digite os dias de internação:");
        int dias = scanner4.nextInt();
        System.out.println("Digite o preço diário:");
        double preco = scanner4.nextDouble();

        internacao1.setIntenacao(motivo, dias, preco, paciente1, enfermeiro1, medico1);
        internacao1.getInternacao();
    }

}
