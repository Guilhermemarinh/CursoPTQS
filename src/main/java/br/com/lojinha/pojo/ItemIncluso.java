package br.com.lojinha.pojo;

public class ItemIncluso {
    private String nome;
    private int quantidade;

    public ItemIncluso(String nomeInicial, int quantidadeInicial) {
        nome = nomeInicial;
        quantidade = quantidadeInicial;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
