/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questoes;

/**
 *Crie uma classe para representar um cliente em um banco. Defina os possíveis atributose métodos.
 * @author valer
 */
public class ClasseCliente {
    
    private String nome;
    private int senha;
    private String banco;
    private String agencia;
    
    
    public void setNome(String n){
      
      nome=n;
  }
          
  public String getNome(){
      return nome;
      
  }     
  
   public void setSenha(int s){
      
      senha=s;
  }
          
  public int getSenha(){
      return senha;
      
  }  
      public void setBanco(String b){
      
      banco=b;
  }
          
  public String getBanco(){
      return banco;
      
  }   
    public void setAgencia(String a){
      
      agencia=a;
  }
          
  public String getAgencia(){
      return agencia;
      
  }     
    
    
}
