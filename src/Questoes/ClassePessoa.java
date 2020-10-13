/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questoes;

/**
 *Crie uma classe para representar uma pessoa, com os atributos privados de nome, idade e
altura. Crie os métodos públicos necessários para acesso aos atributos(sets e gets) e um método para
* calcular a idadeda pessoa de acordo com o ano corrente. Usar JFrame.
 * @author valer
 */
public class ClassePessoa {
    private String nome;
    private int anodenascimento;
    private double altura;
    
       
  public void setNome(String n){
      
      nome=n;
  }
          
  public String getNome(){
      return nome;
      
  }     
  
   public void setAnodenascimento(int a){
      
      anodenascimento=a;
  }
          
  public int getAnodenascimento(){
      return anodenascimento;
      
  }   
  
  public void setAltura(double al){
      
      altura=al;
  }
          
  public double  getAltura(){
           
            
      return altura;
      
  }   
}
