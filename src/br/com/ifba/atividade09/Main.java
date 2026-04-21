/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;
import br.com.ifba.atividade09.model.*;
import br.com.ifba.atividade09.model.objects2D.*;
import br.com.ifba.atividade09.model.objects3D.*;
import java.util.Scanner;

/**
 *
 * @author kpaiv
 */

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Criando um array para 6 formas (3 de 2D e 3 de 3D)
        Forma[] formas = new Forma[6];

        System.out.println("--- Cadastro de Formas Geométricas ---");

        // 1. Quadrado
        System.out.print("Digite o lado do Quadrado: ");
        float ladoQ = leitor.nextFloat();
        formas[0] = new Quadrado(ladoQ);

        // 2. Circulo
        System.out.print("Digite o raio do Círculo: ");
        float raioC = leitor.nextFloat();
        formas[1] = new Circulo(raioC);

        // 3. Triangulo
        System.out.print("Digite a base do Triângulo: ");
        float baseT = leitor.nextFloat();
        System.out.print("Digite a altura do Triângulo: ");
        float altT = leitor.nextFloat();
        formas[2] = new Triangulo(baseT, altT);

        // 4. Cubo
        System.out.print("Digite o lado do Cubo: ");
        float ladoCubo = leitor.nextFloat();
        formas[3] = new Cubo(ladoCubo);

        // 5. Esfera
        System.out.print("Digite o raio da Esfera: ");
        float raioE = leitor.nextFloat();
        formas[4] = new Esfera(raioE);

        // 6. Piramide
        System.out.print("Digite o lado da base da Pirâmide: ");
        float lBaseP = leitor.nextFloat();
        System.out.print("Digite a altura da Pirâmide: ");
        float altP = leitor.nextFloat();
        formas[5] = new Piramide(lBaseP, altP);

        System.out.println("\n--- Resultados do Processamento ---");

        // O laço que processa todas as formas no array (Exatamente como o desafio pede)
        for (Forma f : formas) {
            if (f != null) {
                // Mostra o toString()
                System.out.println("Objeto: " + f.toString());

                // Determina o tipo e exibe os cálculos específicos
                if (f instanceof Forma2D) {
                    Forma2D f2d = (Forma2D) f; // Casting para acessar métodos de 2D
                    System.out.println("Tipo: Bidimensional");
                    System.out.printf("Área: %.2f\n", f2d.obterArea());
                } 
                else if (f instanceof Forma3D) {
                    Forma3D f3d = (Forma3D) f; // Casting para acessar métodos de 3D
                    System.out.println("Tipo: Tridimensional");
                    System.out.printf("Área Superficial: %.2f\n", f3d.obterArea());
                    System.out.printf("Volume: %.2f\n", f3d.obterVolume());
                }
                System.out.println("-----------------------------------");
            }
        }
        
        leitor.close();
    }
}