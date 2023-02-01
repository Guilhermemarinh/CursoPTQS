package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoIternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.PEQUENO);

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(100);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogos", 3);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de Energia", 2);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos().get(2));
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());


        for (ItemIncluso itemAtual : meuProduto.getItensInclusos() ){
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.5222);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoIternacional meuProdutoInternacional = new ProdutoIternacional("Sony", Tamanho.GRANDE);
        meuProdutoInternacional.setValor(0);
    }
}
