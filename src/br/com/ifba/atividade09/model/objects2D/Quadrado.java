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
public class Quadrado extends Forma2D {
    private float lado;
    public Quadrado(float lado) { this.lado = lado; }

    @Override
    public float obterArea() { return lado * lado; }

    @Override
    public String toString() { return "Lado do quadrado: " + lado; }
}
