/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Pedro
 */
public class Vestuario extends Produtos {
    
    private final Double IMPOSTO = 0.10;
    private String Genero;
    private String Numeracao;

    public Vestuario(String Genero, String Numeracao, int IDProduto, String Descricao, Double Valor, int Quantidade, int QuantidadeMinima, String Marca) {
        super(IDProduto, Descricao, Valor, Quantidade, QuantidadeMinima, Marca);
        this.Genero = Genero;
        this.Numeracao = Numeracao;
    }

    public Vestuario(String Genero, String Numeracao) {
        this.Genero = Genero;
        this.Numeracao = Numeracao;
    }
     public Vestuario(int IDProduto, String Descricao, int quantidade) {
        super(IDProduto, Descricao, quantidade);
    }
    
    public Vestuario(){};

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNumeracao() {
        return Numeracao;
    }

    public void setNumeracao(String Numeracao) {
        this.Numeracao = Numeracao;
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
