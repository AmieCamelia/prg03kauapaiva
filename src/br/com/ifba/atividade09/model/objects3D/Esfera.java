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
public class Esfera extends Forma3D {
    private float raio;
    public Esfera(float lado) { this.raio = raio; }

    @Override
    public float obterArea() { return (float) (4 * 3.14 * raio * raio); }
    @Override
    public float obterVolume() {return (float) ((4 / 3) * 3.14 * raio); }

    @Override
    public String toString() { return "Lado do quadrado: " + raio; }
}
