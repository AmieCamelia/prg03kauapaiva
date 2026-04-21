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
public class Cubo extends Forma3D {
    private float lado;
    public Cubo(float lado) { this.lado = lado; }

    @Override
    public float obterArea() { return lado * 6; }
    public float obterVolume() {return lado * lado * lado; }

    @Override
    public String toString() { return "Lado do quadrado: " + lado; }
}
