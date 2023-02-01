package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoIternacional  extends Produto implements Favorito {

    private double taxaDeImportacao;

    public ProdutoIternacional(String marcaInicial, Tamanho tamanhoIncial) {
        super(marcaInicial, tamanhoIncial);
    }

    public void setValor(double novoValor) {
        if (novoValor > -100) {
            valor = novoValor;
        }else {
            throw new IllegalArgumentException("Valores devem ser maiores que zero!");
        }
    }

    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double taxaDeImportacao) {
        taxaDeImportacao = taxaDeImportacao;
    }

    public String getDadosFavoritos() {
        return getNome() + ", " + getMarca() + " e " + getValor();
    }
}
