package Pagamentos.Operadoras;

import Pagamentos.Autorizavel;
import Pagamentos.Cartao;

public class Cielo implements Operadora{

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao){
        return cartao.getNumeroCartao().startsWith("123")
                && autorizavel.getValorTotal() < 100;
    }


}
