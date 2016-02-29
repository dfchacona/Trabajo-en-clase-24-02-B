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
        int eleccion=1; 
        do{
            System.out.println("Ingrese: "
                    + "\n 1. Para registrar los cursos"
                    + "\n 2. Para asignar las notas"
                    + "\n 3. Para calcular el promedio"
                    + "\n 4. Para consultar el nombre de un curso"
                    + "\n 5. Para consultar si un estudiante esta inscrito en un curso"
                    + "\n 6. Para saber si un estudiante esta en periodo de prueba"
                    + "\n 0 Para finalizar el programa");
            eleccion= lectura.nextInt();
            switch(eleccion){
                
        case(1):    
        for (int i = 0; i < 5; i++) {
            
        System.out.println("Ingrese nombre de la materia");
        String nombreM= lectura.next();
        System.out.println("Ingrese codigo de la materia");
        int codigoM= lectura.nextInt();
        System.out.println("Ingrese numero de creditos");
        int numeroCreditos= lectura.nextInt();  
        e1.registrarCursos(nombreM, codigoM, numeroCreditos);
            
        }
        break; 
        case(2):
            for (int i = 0; i < 5; i++) {
            Curso c1=e1.cursos[i];
            System.out.println("Ingrese nota de "+c1.getNombre()+" : ");
            double nota=lectura.nextDouble();
            c1.asignarNota(nota);
        }
        break; 
        case(3):
        e1.calcularPromedio();
        System.out.println(e1.getPromedio());
        break; 
        case(4):
            
        System.out.println("Ingrese codigo materia");
        codigo=lectura.nextInt();
        e1.consultarCurso(codigo);
        break; 
        case(5):
        System.out.println("Ingrese codigo materia");
        codigo=lectura.nextInt();
        e1.consultarInscripcion(codigo);
        break; 
        case(6):
        
        
        System.out.println(e1.periodoPrueba());
        break; 
        }
    }while (eleccion!=0);
        }
    
}
