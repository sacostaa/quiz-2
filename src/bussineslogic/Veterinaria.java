/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussineslogic;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Veterinaria {
    
    private ArrayList <Mascota> mascotasv;

    public Veterinaria() {
        this.mascotasv = new ArrayList <Mascota>();
    }
    
    
    
    

    public ArrayList<Mascota> getMascotasv() {
        return mascotasv;
    }

    public void setMascotasv(ArrayList<Mascota> mascotasv) {
        this.mascotasv = mascotasv;
    }
    
    
    
    public void removermascota(String id){
        
        for (int i = 0; i < mascotasv.size(); i++) {
            if(id.equals(mascotasv.get(i).getId())){
                mascotasv.remove(mascotasv.get(i));
            }
        }
        
    }
    
    public void mostrarmascotaportipos(String tipo){
        
        if (tipo.equals("Hamster")) {
            System.out.println("tipo Hamster");
            for (Mascota m : mascotasv) {
                if(m.getClass() == Hamster.class){
                    Hamster h =(Hamster)m;
                    System.out.println("id: " + h.getId());
                    System.out.println("nombre: " + h.getName());
                    System.out.println("color de pelo: " + h.getColorcabello());
                    System.out.println("peso: "+ h.getPeso());
                    
                }
            }
        }
        if (tipo.equals("Gato")) {
            System.out.println("tipo Gato");
            for (Mascota m : mascotasv) {
                if(m.getClass()== Gato.class){
                    Gato g = (Gato)m;
                    System.out.println("id: " + g.getId());
                    System.out.println("nombre: " + g.getName());
                    System.out.println("color de pelo: " + g.getColorcabello());
                    System.out.println("es casador?: "+ g.isEscazador());
                    
                }
            }
        }
        if (tipo.equals("Perro")) {
            System.out.println("tipo Perro");
            for (Mascota m : mascotasv) {
                if(m.getClass()== Perro.class){
                    Perro p =(Perro)m;
                    System.out.println("id: " + p.getId());
                    System.out.println("nombre: " + p.getName());
                    System.out.println("color de pelo: " + p.getColorcabello());
                    System.out.println("raza :" + p.getRaza());
                    
                }
            }
        }
        
    }
    
    public void mostrarmascotas(){
        System.out.println("lista dinal de mascotas:");
            for (Mascota m : mascotasv) {
                if(m.getClass() == Hamster.class){
                    System.out.println("-Hamster:");
                    Hamster h =(Hamster)m;
                    System.out.println("id: " + h.getId());
                    System.out.println("nombre: " + h.getName());
                    System.out.println("color de pelo: " + h.getColorcabello());
                    System.out.println("peso: "+ h.getPeso());
                }
                    if(m.getClass()== Perro.class){
                        System.out.println("-Perro:");
                    Perro p =(Perro)m;
                    System.out.println("id: " + p.getId());
                    System.out.println("nombre: " + p.getName());
                    System.out.println("color de pelo: " + p.getColorcabello());
                    System.out.println("raza :" + p.getRaza());
                    }
          
                if(m.getClass()== Gato.class){
                    System.out.println("-Gato:");
                    Gato g = (Gato)m;
                    System.out.println("id: " + g.getId());
                    System.out.println("nombre: " + g.getName());
                    System.out.println("color de pelo: " + g.getColorcabello());
                    System.out.println("es casador?: "+ g.isEscazador());
                    
                }
            
        }
                    
                }
                
                
            }
                   
    
        
    
                
            
    


    
    

