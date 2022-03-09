/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Pedro
 */
public class Usuario {
    private String Login;
    private String Nome;
    private String Senha;

    
    public Usuario(String Login, String Nome, String Senha) {
        this.Login = Login;
        this.Nome = Nome;
        this.Senha = Senha;
    }
    
    public Usuario(){};
    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }


    public boolean validaUsuario(String login, String senha){
        for(Usuario u :  Banco.usuarios){
            if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
                return true;
            }
        }
        return false;
    }
    
}
