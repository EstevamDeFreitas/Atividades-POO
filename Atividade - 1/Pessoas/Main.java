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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pessoa1 = new Pessoa("Jhon", 29, (float)1180.00);
        
        System.out.println("Contém o nome Jhon: "+pessoa1.contem("Jhon"));
        System.out.println("É maior de idade: "+pessoa1.verificaMaioridade());
        System.out.println(pessoa1.verificaSalarioMinimo());
        pessoa1.IncrementaSalario();
        System.out.println("Sálario após o incremento: "+pessoa1.getSalario());
    }
    
}
