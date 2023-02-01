package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {
    private double impostoNacional;

    public ProdutoNacional(String marcaInicial, Tamanho tamanhoIncial) {
        super(marcaInicial, tamanhoIncial);
    }

    public double getImpostoNacional() {
        return impostoNacional;
    }


    public void setImpostoNacional(double novoImpostoNacional) {
        impostoNacional = novoImpostoNacional;
    }

    public String getDadosFavoritos() {
        return getNome() + ", " + getMarca() + " e " + getValor();
    }
}
