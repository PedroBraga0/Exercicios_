package _1_CorretoraSeguros_0_;

public class imovel implements Seguravel {

    private double valorMercado;
    private int areaConstruida;

    public imovel(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }


    @Override
    public double calcularValorApolice() {
        // calculos ficticios do valor de uma apólice de um imóvel
        double valorApolice = this.valorMercado * 0.003;
        valorApolice = valorApolice + (areaConstruida * 0.5);
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Imovel com área construida de " + this.areaConstruida
                + " m2 e valor de mercado  " + this.valorMercado;
    }

}











