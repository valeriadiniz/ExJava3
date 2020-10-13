/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questoes;

/**
 *Exercício 7
 * @author valer
 */
public class Principal {
    
     public static void main(String args[]){
    ClasseCliente c =new ClasseCliente();
    c.setNome("Maria");
    c.setSenha(251342);
    c.setAgencia("2345-0");
    c.setBanco("Bradesco");
  
    
    
    System.out.println(c.getNome());
    
     System.out.println(c.getSenha());
      
     System.out.println(c.getAgencia());
       
     System.out.println(c.getBanco());
    
 
  
}
    
    
}
