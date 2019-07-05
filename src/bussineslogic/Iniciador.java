/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussineslogic;
import java.io.*;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Iniciador  {
    
    

    
    public String leermascotas(Veterinaria vet, String codigo)throws illegalArgumentException{
        for (int i = 0; i < vet.getMascotasv().size(); i++) {
          
            if(codigo.equals(vet.getMascotasv().get(i).getId())){
                throw new illegalArgumentException("mascota con id repetido");
            }
                
        }
        
        return "se pudo agregar";
    }
    
    public void controlarveterinaria(Veterinaria vet, String accion){
        
    }
    
    public static void main(String[] args) {
        Iniciador st = new Iniciador();
        Veterinaria v1 = new Veterinaria();
        ArrayList <Persona> personas = new ArrayList <Persona>();
        personas.add (new Persona("Andres", 1203323291));
        personas.add (new Persona ("Maria", 39735679));
        personas.add (new Persona ("Fabian", 123456));
        
        boolean haypersonash= true ;
        
        File f = new File ("pets.txt");
        
        if (f.exists()) {
            try{
                Scanner sc = new Scanner(f);
                String datos [];
                
                
                while (sc.hasNextLine()){
                    
                    
                        datos = sc.nextLine().split(" ");
                         
                    if(datos[0].equals("Dog")){
                        
                        
                        String idp= datos[1];
                        String nombrep = datos[2];
                        String colorp = datos[3];
                        String razap = datos [4];
                        Mascota p1 = new Perro (idp , nombrep, colorp, razap);
                        try{
                            
                        
                        if(st.leermascotas(v1, idp).equals("se pudo agregar")){
                            v1.getMascotasv().add(p1);
                            datos = sc.nextLine().split(" ");
                        for (int i = 0; i < personas.size(); i++) {
                         if(datos[0].equals(personas.get(i).getNombre())){
                             personas.get(i).getMascotas().add(p1);
                             haypersonash = true;
                         
                         }
                             
                         }
                        
                        if (haypersonash == false){
                            String nombreper = datos[0];
                            int idper = Integer.parseInt(datos[1]);
                            personas.add(new Persona(nombreper,idper));
                            haypersonash = true;
                            
                            
                        }
                        }
                            }catch(illegalArgumentException ex){
                             System.out.println("mascota tipo perro con id repetido" +" "+ nombrep);   
                            }
                        
                        
                        
                       
                        
                        
                    }
                        if(datos[0].equals("Cat")){
                        
                        String idg= datos[1];
                        String nombreg = datos[2];
                        String colorg = datos[3];
                        boolean cazag = Boolean.parseBoolean(datos[4]);
                        
                        Mascota p1 = new Gato (idg , nombreg, colorg, cazag);
                       try{
                            
                        
                        if(st.leermascotas(v1, idg).equals("se pudo agregar")){
                            v1.getMascotasv().add(p1);
                            datos = sc.nextLine().split(" ");
                        for (int i = 0; i < personas.size(); i++) {
                         if(datos[0].equals(personas.get(i).getNombre())){
                             personas.get(i).getMascotas().add(p1);
                             haypersonash = true;
                         
                         }
                             
                         }
                        
                        if (haypersonash == false){
                            String nombreper = datos[0];
                            int idper = Integer.parseInt(datos[1]);
                            personas.add(new Persona(nombreper,idper));
                            haypersonash = true;
                            
                            
                        }
                        }
                            }catch(illegalArgumentException ex){
                             System.out.println("mascota tipo gato con id repetido" + " "+ nombreg);   
                            }
                        
                            
                          
                }else{
                        if(datos[0].equals("Hamster")){
                        
                        String idh= datos[1];
                        String nombreh = datos[2];
                        String colorh = datos[3];
                        double pesoh = Double.parseDouble(datos[4]);
                            
                        Mascota p1 = new Hamster(idh , nombreh, colorh, pesoh);
                        try{
                            
                        
                        if(st.leermascotas(v1, idh).equals("se pudo agregar")){
                            v1.getMascotasv().add(p1);
                            datos = sc.nextLine().split(" ");
                        for (int i = 0; i < personas.size(); i++) {
                         if(datos[0].equals(personas.get(i).getNombre())){
                             personas.get(i).getMascotas().add(p1);
                             haypersonash = true;
                         
                         }
                             
                         }
                        
                        if (haypersonash == false){
                            String nombreper = datos[0];
                            int idper = Integer.parseInt(datos[1]);
                            personas.add(new Persona(nombreper,idper));
                            haypersonash = true;
                            
                            
                        }
                        }
                            }catch(illegalArgumentException ex){
                             System.out.println("mascota tipo Hamster con id repetido"+" "+ nombreh);   
                            }
                        
                        
                    }
                    }
                    
                    
                    }
                
                
            }catch(FileNotFoundException ex){
                System.out.println("no encontro archivo");
            }
            
            
            
            
                
            }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(" si quiere remover una mascota o listarlas segun si tipo escriba 1, si quiere finalizar el programa poner 2");
            Scanner f1 = new Scanner (System.in);
                int p1 = f1.nextInt();
            if(p1 == 1){
                System.out.println("si quiere remover mascota poner 1, si quiere listar mascotas segun el tipo poner 2");
                Scanner f2 = new Scanner ( System.in);
                int p2 = f2.nextInt();
                if(p2 == 1){
                    System.out.println("cual es la id de la mascota que quiere remover?");
                    Scanner r = new Scanner (System.in);
                    String id = r.nextLine();
                    v1.removermascota(id);
                }
                if(p2 == 2){
                    System.out.println("si quiere listar tipo perro poner 1, si quiere listar tipo gato poner 2 y si quiere listar tipo hamster poner 3");
                    Scanner r = new Scanner (System.in);
                    int tipo = r.nextInt();
                    if( tipo == 1){
                        v1.mostrarmascotaportipos("Perro");
                    }
                    if( tipo == 2){
                        v1.mostrarmascotaportipos("Gato");
                    }
                    if( tipo == 3){
                        v1.mostrarmascotaportipos("Hamster");
                    }
                    
                }
            }
                
            if(p1 == 2){
                v1.mostrarmascotas();
            
                break;
            }
            
            
                
            }
        PrintStream salida = null;
         try{
                           salida = new PrintStream(f);
                           }catch(IOException e){
                           System.out.println("esepcion");
                       }
        for (Persona p: personas) {
            for (Mascota m : p.getMascotas()) {
               
                    
                       
                       
                       
                      
                           if (m.getClass()== Perro.class) {
                               Perro p1 = (Perro)m;
                              salida.println("Dog"+" "+p1.getId()+" "+p1.getName()+" "+p1.getColorcabello()+" "+p1.getRaza()); 
                              salida.println(p.getNombre()+" "+p.getId());
                           }
                           if (m.getClass()== Hamster.class) {
                               Hamster h1 = (Hamster)m;
                              salida.println("Hamster"+" "+h1.getId()+" "+h1.getName()+" "+h1.getColorcabello()+" "+h1.getPeso()); 
                              salida.println(p.getNombre()+" "+p.getId());
                           }
                           if (m.getClass()== Gato.class) {
                               Gato g1 = (Gato)m;
                              salida.println("Cat"+" "+g1.getId()+" "+g1.getName()+" "+g1.getColorcabello()+" "+g1.isEscazador()); 
                              salida.println(p.getNombre()+" "+p.getId());
                           }
                           
                       
                
                
            }
            
                
            }
        
        salida.flush();
                           salida.close();
                           
            
        
        
        }
        
        
        
        
        
       
        }
    
   

