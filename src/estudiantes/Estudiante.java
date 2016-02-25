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
public class Estudiante {
    private String nombre; 
    private String apellido; 
    private int codigo; 
    private double promedio;
    private Curso [] cursos; 
    private int cursosInscritos; 
    
public Estudiante(String nombre, String apellido, int codigo){
    this.nombre=nombre; 
    this.apellido=apellido; 
    this.codigo=codigo; 
}    

public void registrarCursos (String nombre, int codigo, int numeroCreditos, Curso [] cursos){

        this.cursos[this.cursosInscritos]=new Curso(nombre,codigo,numeroCreditos);
        this.cursosInscritos++;
}

public boolean comprobarCupo (int codigo){
    boolean cupoInscrito=false; 
    for(int i=0; i<5; i++){
        Curso c = this.cursos[i];
        if (c.getCodigo()==codigo){
            cupoInscrito=true;
            break;
        }
    }
    return cupoInscrito;         
}

public void calcularPromedio(){
    double notaTotal=0;
    int totalCreditos=0;
    for (int i = 0; i < 6; i++) {
       Curso c= this.cursos[i];
       notaTotal=notaTotal+(c.getNota()*c.getNumCreditos()); 
       totalCreditos=totalCreditos+c.getNumCreditos(); 
    }
    this.promedio=notaTotal/totalCreditos;
}

public double getPromedio(){
    return this.promedio;
}

public boolean periodoPrueba(){
   boolean periodoPrueba=false;
    if(this.promedio<3.25){
       periodoPrueba=true;
   }
    return periodoPrueba; 
}

}


