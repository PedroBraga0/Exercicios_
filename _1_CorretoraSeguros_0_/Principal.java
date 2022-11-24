package _1_CorretoraSeguros_0_;

public class Principal {
    public static void main(String[] args) {

        CorretoraSeguros corretora = new CorretoraSeguros();
        Carro meuCarro = new Carro(45000,2012);
        imovel minhaCasa = new imovel(1000000,300);
        corretora.FazerPropostaSeguro(meuCarro);
        corretora.FazerPropostaSeguro(minhaCasa);
    }
}
