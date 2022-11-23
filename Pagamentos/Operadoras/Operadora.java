package Pagamentos.Operadoras;

import Pagamentos.Autorizavel;
import Pagamentos.Cartao;

public interface Operadora {
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
