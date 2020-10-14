/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questoes;

/**
 *
 * @author valer
 */
public class Carro {
    
    private int codigo;
    private String nome;
    private String marca;
    private String modelo;
    private double valorlocacao;
    private int diasdelocacao;
    private double valoraluguel;
    private double preco;
    
    
    public String getNome(){
        return nome;
        
    }
    
    public void setNome(String n){
        this.nome=n;
    }
    
     public String getMarca(){
        return marca;
        
    }
    
    public void setMarca(String mar){
        this.marca=mar;
    }
    
     public String getModelo(){
        return modelo;
        
    }
    
    public void setModelo(String mod){
        this.modelo=mod;
    }
    
     public int  getCodigo(){
        return codigo;
        
    }
    
    public void setCodigo(int cod){
        this.codigo=cod;
    }
    
     public int  getDiasdelocacao(){
        return diasdelocacao;
        
    }
    
    public void setDiasdelocacao(int diasdelo){
        this.diasdelocacao=diasdelo;
    
}
    
    public double  getValorlocacao(){
        return valorlocacao;
        
    }
    
    public void setValorlocacao(double valorloc){
        this.valorlocacao=valorloc;
    

}
       public double  getValoraluguel(){
        return valoraluguel;
        
    }
    
    public void setValoraluguel(double valoral){
        this.valoraluguel=valoral;
    
}
         public double  getPreco(){
        return preco;
        
    }
    
    public void setPreco(double pre){
        this.preco=pre;
    
}

    

   
}

