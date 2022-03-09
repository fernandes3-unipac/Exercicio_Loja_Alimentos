package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pedro
 */
public class Eletronico extends Produtos{

 private final Double IMPOSTO = 0.3;
 private Double peso;
    public Eletronico(int IDProduto, String Descricao, Double Valor, int Quantidade, int QuantidadeMinima, String Marca, Double peso) {
        super(IDProduto, Descricao, Valor, Quantidade, QuantidadeMinima, Marca);
        this.peso = peso;
    }

    public Eletronico() {
    }
 public Eletronico(int IDProduto, String Descricao, int quantidade) {
        super(IDProduto, Descricao, quantidade);
    }
    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
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
