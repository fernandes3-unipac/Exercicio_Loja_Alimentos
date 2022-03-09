/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Venda {
    private int IDVenda;
    private ArrayList <Produtos> produto;

   
    private Double valorVenda;
    private Double valorTotalImposto;
    private String dataVenda;
    
     public Venda(int IDVenda, ArrayList<Produtos> produto, Double valorVenda, Double valorTotalImposto, String dataVenda) {
        this.IDVenda = IDVenda;
        this.produto = produto;
        this.valorVenda = valorVenda;
        this.valorTotalImposto = valorTotalImposto;
        this.dataVenda = dataVenda;
    }
     
     
   /* 
    public Venda(int IDVenda, ArrayList<Produtos> produto, Double valorVenda, Double valorTotalImposto, String dataVenda) {
        this.IDVenda = IDVenda;
        this.produto = produto;
        this.valorVenda = valorVenda;
        this.valorTotalImposto = valorTotalImposto;
        this.dataVenda = dataVenda;
    }

    public int retornaTamanho(){
       return produto.size();
    }
    
    public int getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(int IDVenda) {
        this.IDVenda = IDVenda;
    }

    public ArrayList<Produtos> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produtos> produto) {
        this.produto = produto;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getValorTotalImposto() {
        return valorTotalImposto;
    }

    public void setValorTotalImposto(Double valorTotalImposto) {
        this.valorTotalImposto = valorTotalImposto;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    public String getDataFormatada(){
          return new SimpleDateFormat("dd/MM/yyyy").format(dataVenda);
    }
    
    */
     
     public int getTamanho(){
         return produto.size();
     }

    public int getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(int IDVenda) {
        this.IDVenda = IDVenda;
    }

    public ArrayList<Produtos> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produtos> produto) {
        this.produto = produto;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getValorTotalImposto() {
        return valorTotalImposto;
    }

    public void setValorTotalImposto(Double valorTotalImposto) {
        this.valorTotalImposto = valorTotalImposto;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    
}
