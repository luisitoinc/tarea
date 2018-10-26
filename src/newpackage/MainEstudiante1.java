
package newpackage;
import ClasesYObjetos.Estudiante;
import java.util.Scanner;

public class MainEstudiante1 {
    
    public static void main(String [] args){
    
    float nota;
    
    Scanner teclado=  new Scanner(System.in);
    System.out.println("Nombre: ");
    String nombre=teclado.next();
    
    do{
    System.out.println("Nota final: ");
    nota=teclado.nextFloat();
    }while(nota>7 || nota<1);
    
    Estudiante e=new Estudiante();
    e.setnombre(nombre);
    e.setNotafinal(nota);
    
}
