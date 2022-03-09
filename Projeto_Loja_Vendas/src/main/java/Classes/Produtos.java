/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Pedro
 */
public abstract class Produtos {

    private int IDProduto;
    private String Descricao;
    private Double Valor;
    private int Quantidade;
    private int QuantidadeMinima;
    private String Marca;

    public Produtos(int IDProduto, String Descricao, Double Valor, int Quantidade, int QuantidadeMinima, String Marca) {
        this.IDProduto = IDProduto;
        this.Descricao = Descricao;
        this.Valor = Valor;
        this.Quantidade = Quantidade;
        this.QuantidadeMinima = QuantidadeMinima;
        this.Marca = Marca;
    }

    public Produtos(int IDProduto, String Descricao, int quantidade) {
        this.IDProduto = IDProduto;
        this.Descricao = Descricao;
        this.Quantidade = quantidade;
    }

    public Produtos() {
    }

    ;

    public int getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto = IDProduto;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double Valor) {
        this.Valor = Valor;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getQuantidadeMinima() {
        return QuantidadeMinima;
    }

    public void setQuantidadeMinima(int QuantidadeMinima) {
        this.QuantidadeMinima = QuantidadeMinima;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public abstract Double calculaValorTotalImposto();

    public abstract Double calculaValorTotalVenda();

    public abstract Double calculaValorDolar();

}
