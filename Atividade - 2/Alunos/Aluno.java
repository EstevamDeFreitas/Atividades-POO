/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alunos;

/**
 *
 * @author flavi
 */
public class Aluno {
    private String nome;
    private int matricula;
    private int idade;
    private double mensalidade;
    
    public Aluno(String nome, int matricula, int idade, double mensalidade){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.mensalidade = mensalidade;
    }
    
    public void Desconto(double mensalidade){
        if(mensalidade >= 1000){
            this.mensalidade = (mensalidade*0.15);
        }
        else{
            this.mensalidade = (mensalidade*0.20);
        }
    }
    
    public void Desconto(double mensalidade, float desconto){
        this.mensalidade = mensalidade*desconto;
    }
}
