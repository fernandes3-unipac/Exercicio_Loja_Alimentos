/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Pedro
 */
public class Alimentos extends Produtos{
    private final Double IMPOSTO = 0.05;
    private String validade;
    private Double peso;

    public Alimentos(String validade, Double peso, int IDProduto, String Descricao, Double Valor, int Quantidade, int QuantidadeMinima, String Marca) {
        super(IDProduto, Descricao, Valor, Quantidade, QuantidadeMinima, Marca);
        this.validade = validade;
        this.peso = peso;
    }

    public Alimentos(int IDProduto, String Descricao, int quantidade) {
        super(IDProduto, Descricao, quantidade);
    }

   
    public Alimentos(String validade, Double peso) {
        this.validade = validade;
        this.peso = peso;
    }

    public Alimentos(){};

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
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

    @Override
   public Double calculaValorDolar() {
        return super.getValor() / 5.13;
    }
  

}
