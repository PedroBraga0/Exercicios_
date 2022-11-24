package _1_CorretoraSeguros_0_;

public class CorretoraSeguros {

    public void FazerPropostaSeguro (Seguravel objetoSeguravel) {
        System.out.println("--------------------------------");
        System.out.println("\nCORRETORA DE SEGUROS - PROPOSTA");
        System.out.println("-------------------------------");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println("\nVALOR DA APOLICE: " + objetoSeguravel.calcularValorApolice());
        System.out.println("--------------------------------");
    }
}
