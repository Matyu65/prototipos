/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLS_class;

import javax.swing.JOptionPane;

/**
 *
 * @author 3
 */
public class cls_operaciones {
    ///atributos de la clase
    
    //////atributos de la clase para el metodo hipotenusa
    private double ladoA;
    private double ladoB;
    
    //////////atributos de la clase para los metodos de resistencia
    private double resis1;
    private double resis2;
    private double resis3;
    private double voltaje;
    private double resistotal;
    
    
    
    ///////metodo hipotenusa:
    /*
    metodo que tiene una variable local hipo de tipo double para recuperar el resultado de la operacion requerida,
    consta de un try catch para evitar el que el software no pare por fallas internas,el metodo consta de una variable la cual almacena 
    el resultado de de una raiz cuadrada, la cual contiene la suma de los lados de un triangulo elevados al cuadrado. en pocas palabra estamos aplicando el 
    teorema de pitagoras
    
    !!!!!!!restorna un valor double el cual es el resultado de la hipotenusa
    */
    public double hipotenusa()
    {
        double hipo=0.0;
        
        try 
        {
          hipo=Math.sqrt(((this.ladoA*this.ladoA))+(this.ladoB*this.ladoB));
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"el resultado esta malo");
        }
       
        return hipo;
       
        
    }
    
    public double resistencia_paralelo()
    {
        double total_resistencia=0.0;
        try 
        {
            
        total_resistencia=this.resis1+this.resis2+this.resis3;
        this.resistotal=total_resistencia;
        
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"el resultado esta malo");
        }
        
        return total_resistencia;
    }
    
    
    public double intensidad()
    {
        double inten_total=0.0;
        try 
        {
           inten_total=this.voltaje/this.resistotal;
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"el resultado esta malo");
        }
        return inten_total;
    }
    
    
    
    
    

    /**
     * @return the ladoA
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    /**
     * @return the resis1
     */
    public double getResis1() {
        return resis1;
    }

    /**
     * @param resis1 the resis1 to set
     */
    public void setResis1(double resis1) {
        this.resis1 = resis1;
    }

    /**
     * @return the resis2
     */
    public double getResis2() {
        return resis2;
    }

    /**
     * @param resis2 the resis2 to set
     */
    public void setResis2(double resis2) {
        this.resis2 = resis2;
    }

    /**
     * @return the resis3
     */
    public double getResis3() {
        return resis3;
    }

    /**
     * @param resis3 the resis3 to set
     */
    public void setResis3(double resis3) {
        this.resis3 = resis3;
    }

    /**
     * @return the voltaje
     */
    public double getVoltaje() {
        return voltaje;
    }

    /**
     * @param voltaje the voltaje to set
     */
    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    /**
     * @return the resistotal
     */
    public double getResistotal() {
        return resistotal;
    }

    /**
     * @param resistotal the resistotal to set
     */
    public void setResistotal(double resistotal) {
        this.resistotal = resistotal;
    }

    /**
     * @return the hipotenusa
     */
   
    
    
    
}
