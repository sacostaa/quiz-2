package bussineslogic;

import java.util.ArrayList;


public class Persona {
    
    private String nombre;
    private int id;
    private ArrayList <Mascota> mascotas;

    public Persona(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.mascotas = mascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    
    
    public void mostrarmascotas(){
        if(mascotas.size()> 0){
            for (int i = 0; i < mascotas.size(); i++) {
                System.out.println("mascotas:");
                if (mascotas.get(i) instanceof Gato) {
                    
                }
                
                    
                }
            }
        }
    }
    

