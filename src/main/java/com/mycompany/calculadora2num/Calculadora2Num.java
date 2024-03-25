/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora2num;
/**
 *
 * @author Tuany
 */

public class Calculadora2Num {
    //private attributes
    private float n1;
    private float n2;

    //public methods
    public void setn1(float num1) {
        this.n1 = num1;
    }

    public float getn1() {
        return this.n1;
    }

    public void setn2(float num2) {
        this.n2 = num2;
    }

    public float getn2() {
        return this.n2;
    }

    public float calcular(int opcao) {
            switch (opcao) {
                case 1:
                    return soma();
                case 2:
                    return subtracao();
                case 3:
                    return multiplicacao();
                case 4:
                    return divisao();
            }
        return 0;
    }

    public float calcular(int opcao, float num1, float num2) {
        setn1(num1);// Atualiza o valor do atributo n1
        setn2(num2);// Atualiza o valor do atributo n2
        return calcular(opcao);// Chama o método calcular principal com os novos valores
    }

    //private methods
    private float soma() {
        return this.n1 + this.n2;
    }

    private float subtracao() {
        return this.n1 - this.n2;
    }

    private float multiplicacao() {
        return this.n1 * this.n2;
    }

    private float divisao() {
    if (n2 == 0){
         throw new ArithmeticException("Divisão por zero!");
    }
           
    return this.n1 / this.n2;
  
}

    // Main method
    public static void main(String[] args) {
        // Exemplo de uso da classe Calculadora2Num
        Calculadora2Num calculadora = new Calculadora2Num();
        calculadora.setn1(0);
        calculadora.setn2(5);
        
        
            float resultado = calculadora.calcular(4); // 1 representa a operação de soma
            System.out.println("Resultado: " + resultado);
            
    }
}
