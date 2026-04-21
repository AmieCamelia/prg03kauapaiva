/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.model;

/**
 *
 * @author kpaiv
 */
//herda as caracteristicas de forma. todas suas caracteristicas são herdadas pelas classes na pasta objects3D.
public abstract class Forma3D extends Forma {
    public abstract float obterArea();
    public abstract float obterVolume();
}
