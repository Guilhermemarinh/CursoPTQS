package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    protected double valor;
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;

    public Produto(String marcaInicial, Tamanho tamanhoIncial) {
        //Definir comando que serao iniciados durante a instanciacao
        marca = marcaInicial;
        tamanho = tamanhoIncial;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double novoValor) {
        if (novoValor > 0) {
            valor = novoValor;
        }else {
            throw new IllegalArgumentException("Valores devem ser maiores que zero!");
        }
    }
    public String getNome(){
       return nome;
    }
    public void setNome(String novoNome) {
        nome = novoNome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String novaMarca){
        marca = novaMarca;
    }
    public Tamanho getTamanho() {
        return tamanho;
    }
    public void setTamanho(Tamanho novoTamanho){
        tamanho = novoTamanho;
    }
    public List<ItemIncluso> getItensInclusos() {
        return itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novosItensInclusos) {
        itensInclusos = novosItensInclusos;
    }
}
