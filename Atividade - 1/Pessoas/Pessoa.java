/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

/**
 *
 * @author flavi
 */
public class Pessoa {
    private String nome;
    private int idade;
    private float salario;
    
    Pessoa(String nome, int idade, float salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    
    public boolean verificaMaioridade(){
        if(this.idade >= 18){
            return true;
        } else{
            return false;
        }
    }
    
    public String verificaSalarioMinimo(){
        float salarioMinimo = (float)1177.00;
        float s1 = this.salario / salarioMinimo;
        float s2 = Math.round(s1);

        if (s1 < 1){
            return("Recebe menos que 1 sálario minímo");
        }
        else if (s1 <= s2){
            return("Recebe entre "+(s2-1)+" e "+s2+" sálarios minímos");
        }
        else{
            return("Recebe entre "+s2+" e "+(s2+1)+" sálarios minímos");
        }
    }
    
    public boolean contem(String comparador){
        return this.nome.contains(comparador);
    }
    
    public void IncrementaSalario(){
        if(this.salario<2000){
            this.salario = this.salario+(this.salario*(float)0.30);
        }
        else{
            this.salario = this.salario+(this.salario*(float)0.25);
        }
    }
    
    public float getSalario(){
        return this.salario;
    }
}
