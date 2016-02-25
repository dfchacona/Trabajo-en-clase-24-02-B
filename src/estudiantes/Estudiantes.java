/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

/**
 *
 * @author dieguischa
 */
public class Estudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso [] cursos= new Curso [5]; 
        java.util.Scanner lectura= new java.util.Scanner (System.in);
        System.out.println("Ingrese nombre del estudiante");
        String nombre= lectura.next();
        System.out.println("Ingrese apellido del estudiante");
        String apellido= lectura.next();
        System.out.println("Ingrese codigo del estudiante");
        int codigo= lectura.nextInt();
        
        Estudiante e1= new Estudiante(nombre, apellido, codigo);
        for (int i = 0; i < 5; i++) {
            
        System.out.println("Ingrese nombre de la materia");
        String nombreM= lectura.next();
        System.out.println("Ingrese codigo de la materia");
        int codigoM= lectura.nextInt();
        System.out.println("Ingrese numero de creditos");
        int numeroCreditos= lectura.nextInt();  
        e1.registrarCursos(nombreM, codigoM, numeroCreditos, cursos);
            
        }
        
        System.out.println("Ingrese codigo materia");
        codigo=lectura.nextInt();
        System.out.println(e1.comprobarCupo(codigo));
        codigo=lectura.nextInt();
        System.out.println(e1.comprobarCupo(codigo));
        
        for (int i = 0; i < 5; i++) {
            Curso c1=cursos[i];
            System.out.println("Ingrese nota:");
            double nota=lectura.nextInt();
            c1.asignarNota(nota);
        }
        e1.calcularPromedio();
        System.out.println(e1.getPromedio());
        
        
        System.out.println(e1.periodoPrueba());
        
    }
    
}
