/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Bebidas extends Produtos {

    private final Double IMPOSTO = 0.25;
    private String Validade;
    private Double Volume;

    public Bebidas(String Validade, Double Volume, int IDProduto, String Descricao, Double Valor, int Quantidade, int QuantidadeMinima, String Marca) {
        super(IDProduto, Descricao, Valor, Quantidade, QuantidadeMinima, Marca);
        this.Validade = Validade;
        this.Volume = Volume;
    }

    public Bebidas(String Validade, Double Volume) {
        this.Validade = Validade;
        this.Volume = Volume;
    }
     public Bebidas(int IDProduto, String Descricao, int quantidade) {
        super(IDProduto, Descricao, quantidade);
    }

    public Bebidas() {
    }

    public String getValidade() {
        return Validade;
    }

    public void setValidade(String Validade) {
        this.Validade = Validade;
    }

    public Double getVolume() {
        return Volume;
    }

    public void setVolume(Double Volume) {
        this.Volume = Volume;
    }

    @Override
    public Double calculaValorTotalVenda() {

        return (super.getValor() * IMPOSTO) + super.getValor();
    }

    @Override
    public Double calculaValorTotalImposto() {
        return (super.getValor()) * IMPOSTO;
    }
 public Double calculaValorDolar() {
        return super.getValor() / 5.13;
    }
    
}
