/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxectofactura;

/**
 *
 * @author Usuario
 */
public class ArtigoFactura {
  
    private String id;

    private String descricion;

    private int cantidade;

    private double prezoUnitario;

    public ArtigoFactura(String id, String descricion, int cantidade, double prezoUnitario) {
        this.id = id;
        this.descricion = descricion;
        this.cantidade = cantidade;
        this.prezoUnitario = prezoUnitario;
    }

    public double getPrezoUnitario() {
        return prezoUnitario;
    }

    public void setPrezoUnitario(double prezoUnitario) {
        this.prezoUnitario = prezoUnitario;
    }

    public int getCantidade() {
        return cantidade;
    }

    public void setCantidade(int cantidade) {
        this.cantidade = cantidade;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double obterPrezoTotal(){
    double resultado = prezoUnitario*cantidade;
    return resultado;
    }
    @Override
    public String toString() {
        return "ArtigoFactura{" + "id=" + id + ", descricion=" + 
                descricion + ", cantidade=" + cantidade + ", prezoUnitario=" + prezoUnitario + '}';
    }
  
}
