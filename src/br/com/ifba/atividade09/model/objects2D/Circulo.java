/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model.objects2D;

import br.com.ifba.atividade09.model.Forma2D;

/**
 *
 * @author kpaiv
 */
public class Circulo extends Forma2D {
    private float raio;
    public Circulo(float lado) { this.raio = raio; }

    @Override
    public float obterArea() { return (float) (raio * raio * 3.14);}

    @Override
    public String toString() { return "Raio do circulo: " + raio; }
}
