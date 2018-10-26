
package ClasesYObjetos;

import java.util.Scanner ;

public class Mainvariosestudiantes {
    
    public static void main(String [] args){
        
        int n; float nota; String nombre; 
        Scanner teclado=new Scanner(System.in); int totalap=0, i, totalrep=0;
        
        do{
        System.out.print("ingrese cuantos :");
        n=teclado.nextInt();
        }while(n<1);
        
        for(i=0;i<n;i++){
            System.out.println("nombre:");
            nombre=teclado.next();
            Estudiante e;
            e=new Estudiante();
            e.setnombre(nombre);
            
            do{
            System.out.println("Nota final: ");
            nota=teclado.nextFloat();
            }while(nota>7 || nota<1);
            
            e.setNotafinal(nota);
            
            if(e.estaaprobado()==true){
                totalap+=1;
            }else{
            totalrep+=1;
            }
             System.out.println("su nombre es " + e.getnombre() );
        }
        
       
    }
}
