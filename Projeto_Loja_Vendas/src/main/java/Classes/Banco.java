/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Pedro
 */
public class Banco {
  public static ArrayList<Usuario> usuarios;
  public static ArrayList<Produtos> produtos;
  public static ArrayList<Venda> vendas;
  
  public static void startaBanco(){
      usuarios = new ArrayList<>();
      vendas =  new ArrayList<>();
      //public Bebidas(String Validade, Double Volume, int IDProduto, String Descricao, Double Valor, int Quantidade, int QuantidadeMinima, String Marca) {
      Usuario user1 = new Usuario("pedrinho123","Pedro","123");
      Bebidas b = new Bebidas("18/07/1993",3.0,25,"COCA-COLA",8.2,50,2,"COCA");
      usuarios.add(user1);
      Alimentos al1 = new Alimentos("18/07/1993", 2.5, 20,"Banana", 23.50, 50, 1,"Prata");
      produtos =  new ArrayList<>();
      produtos.add(al1);
      produtos.add(b);
      
      //  public Venda(int IDVenda, ArrayList<Produtos> produto, Double valorVenda, Double valorTotalImposto, String dataVenda) {
     
     
      
  }
    
}
