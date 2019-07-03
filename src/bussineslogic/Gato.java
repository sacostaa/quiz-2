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
public class Gato extends Mascota{
    
    private boolean escazador;

    public Gato(String id, String name, String colorcabello,boolean escazador) {
        super(id, name, colorcabello);
        this.escazador=escazador;
    }

    @Override
    public String hacersonido() {
        return "miau";
    }
    
    
    
}
