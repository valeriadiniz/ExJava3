/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questoes;

/**
 *Crie uma classe para represntar um jogador de futebol com os atributos nome, posição, data
 * de nascimento, nacionalidade, altura e peso. Crie os métodos getters e setters. Preencha os dados e exiba-os. Usar JFrame.
 * @author valer
 */
public class ClasseJogador {
    String nome;
    String posicao;
    String datadenascimento;
    String nacionalidade;
    double altura;
    double peso;
    
     public void setNome(String n){
      
      nome=n;
  }
          
  public String getNome(){
      return nome;
      
  }     
   public void setPosicao(String p){
      
      posicao=p;
  }
          
  public String getPosicao(){
      return posicao;
      
  }     public void setDatadenascimento(String d){
      
      datadenascimento=d;
  }
          
  public String getDatadenascimento(){
      return datadenascimento;
      
  }     
   public void setNacionalidade(String na){
      
      nacionalidade=na;
  }
          
  public String getNacionalidade(){
      return nacionalidade;
      
  }     
       public void setAltura(double al){
      
      altura=al;
  }
          
  public double getAltura(){
      return altura;
      
  }   
     public void setPeso(double p){
      
      peso=p;
  }
          
  public double getPeso(){
      return peso;
    
}
}
