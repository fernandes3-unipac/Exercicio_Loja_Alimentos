package Classes;


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class Higiene extends Produtos{
    private final Double IMPOSTO = 0.05;
    private Double peso ;
    private String validade;

    public Higiene(Double pesoVolume, String validade, int IDProduto, String Descricao, Double Valor, int Quantidade, int QuantidadeMinima, String Marca) {
        super(IDProduto, Descricao, Valor, Quantidade, QuantidadeMinima, Marca);
        this.peso = pesoVolume;
        this.validade = validade;
    }

    public Higiene(Double pesoVolume, String validade) {
        this.peso = pesoVolume;
        this.validade = validade;
    }

     public Higiene(int IDProduto, String Descricao, int quantidade) {
        super(IDProduto, Descricao, quantidade);
    }
    
    
   public Higiene(){};

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
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
