/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussineslogic;

/**
 *
 * @author Estudiante
 */
public class Hamster extends Mascota{
    
    private double peso;

    public Hamster(String id, String name, String colorcabello,double peso) {
        super(id, name, colorcabello);
        this.peso=peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    

    @Override
    public String hacersonido() {
        return " ";
    }
    
    
    
}
