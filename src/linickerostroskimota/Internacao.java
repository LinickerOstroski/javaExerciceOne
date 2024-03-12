package linickerostroskimota;

import java.util.Scanner;

public class Internacao {

    private int identificador;
    private String motivoInternacao;
    private int quantidadeDiasInternacao;
    private double valorDoDiaDeInternacao;
    private Paciente paciente;
    private Enfermeiro enfermeiro;
    private Medico medico;
    private static int totalDeInternacoes;

    Internacao() {
        Internacao.totalDeInternacoes = Internacao.totalDeInternacoes + 1;
        identificador = Internacao.totalDeInternacoes;
    }
    //Getters e Setters

    public void setIntenacao(String motivoInternacao, int quantidadeDiasInternacao,
            double valorDoDiaDeInternacao, Paciente paciente, Enfermeiro enfermeiro,
            Medico medico) {

        this.motivoInternacao = motivoInternacao;
        this.quantidadeDiasInternacao = quantidadeDiasInternacao;
        this.valorDoDiaDeInternacao = valorDoDiaDeInternacao;
        this.paciente = paciente;
        this.enfermeiro = enfermeiro;
        this.medico = medico;
    }

    public void getInternacao() {
        System.out.println("Internação de número: " + this.identificador);
        System.out.println("Paciente: " + this.paciente.getNome());
        System.out.println("Enfermeiro envolvido: " + this.enfermeiro.getNome());
        System.out.println("Médico envolvido: " + this.medico.getNome());
        System.out.println("Motivo da internação: " + this.motivoInternacao);
        System.out.println("Quantidade de dias internado: " + this.quantidadeDiasInternacao);
        System.out.println("Valor do dia de internação: " + this.valorDoDiaDeInternacao);

        double valorTotal = this.quantidadeDiasInternacao * this.valorDoDiaDeInternacao;

        System.out.println("Total em R$ que " + this.paciente.getNome() + "terá a pagar: " + valorTotal);
        System.out.println("\n");
    }
}
