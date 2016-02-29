/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author Diego Chacon 
 */
public class Curso {
 
    private String nombre; 
    private int codigo; 
    private int numeroCreditos; 
    private double nota; 
    
    
    public Curso(String nombre, int codigo, int numeroCreditos){
        this.nombre=nombre;
        this.codigo=codigo;
        this.numeroCreditos=numeroCreditos;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
   
    public void asignarNota(double nota){
        this.nota=nota;
    }
    
    public double getNota(){
        return this.nota;
    }
    
    public int getNumCreditos(){
        return this.numeroCreditos;
    }
    public String getNombre(){
        return this.nombre;
    }
}
