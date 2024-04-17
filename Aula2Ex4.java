package com.mycompany.aula2ex4;

import java.util.Scanner; //importa o pacote de scan

public class Aula2Ex4 
{

    public static void main(String[] args) //define o método
    {
        Scanner leitor = new Scanner(System.in); //criando uma nova instancia de chamada
        int valor1, valor2, valor3;              //declara as variáveis
        
        System.out.print("Digite os valores:\n"); //exiba ...
        valor1 = leitor.nextInt();             //le o valor e armazena na variavel
        valor2 = leitor.nextInt();             //le o valor e armazena na variavel
        valor3 = leitor.nextInt();              //le o valor e armazena na variavel
        
        if (valor1 > valor2 && valor1 > valor3)               //se valor1 > valor2 e valor1 > valor3 exibir valor1
        {
            System.out.println("" + valor1);
        }
        else if (valor2 > valor3)                             //se valor2 > valor3 exibir valor2
        {
            System.out.println("" + valor2);
        }
        else                                                    //se não exibir valor3
        {
            System.out.println("" + valor3);
        }
    }
}
