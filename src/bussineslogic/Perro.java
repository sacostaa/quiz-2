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
public class Perro extends Mascota{

    private String raza;

    public Perro(String id, String name, String colorcabello, String raza) {
        super(id, name, colorcabello);
        this.raza = raza;
    }
    

    
    
    

    @Override
    public String hacersonido() {
        return "guau";
    }
    
}
