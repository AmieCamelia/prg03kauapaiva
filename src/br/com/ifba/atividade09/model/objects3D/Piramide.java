/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model.objects3D;

import br.com.ifba.atividade09.model.Forma3D;

/**
 *
 * @author kpaiv
 */
public class Piramide extends Forma3D {
    private float ladoBase;
    private float altura;

    public Piramide(float ladoBase, float altura) {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    @Override
    public float obterArea() {
        float areaBase = ladoBase * ladoBase;
        
        // Cálculo da apótema lateral (usando Pitágoras)
        // apotema^2 = altura^2 + (ladoBase/2)^2
        double apotema = Math.sqrt(Math.pow(altura, 2) + Math.pow(ladoBase / 2, 2));
        
        // Área lateral = 4 * (base * apotema / 2) -> simplificando: 2 * base * apotema
        double areaLateral = 2 * ladoBase * apotema;
        
        return (float) (areaBase + areaLateral);
    }

    @Override
    public float obterVolume() {
        // Volume = (Área da Base * Altura) / 3
        return (float) ((Math.pow(ladoBase, 2) * altura) / 3);
    }

    @Override
    public String toString() {
        return String.format("Pirâmide Quadrada [Lado da Base: %.2f, Altura: %.2f]", ladoBase, altura);
    }
}