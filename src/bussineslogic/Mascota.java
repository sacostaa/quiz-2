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
public abstract class Mascota {
    
        protected String id;
        protected String name;
        protected String colorcabello;

    public Mascota(String id, String name, String colorcabello) {
        this.id = id;
        this.name = name;
        this.colorcabello = colorcabello;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorcabello() {
        return colorcabello;
    }

    public void setColorcabello(String colorcabello) {
        this.colorcabello = colorcabello;
    }
        
        
        
        
        public abstract String hacersonido();
    
}
