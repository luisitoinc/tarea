
package newpackage;

import ClasesYObjetos.Estudiante;

public class MainEstudiante {
   
    public static void main(String [] args){
    Estudiante uno, dos;
    uno = new Estudiante();
    dos= new Estudiante();
    uno.setnombre("wacoldo");
    uno.setNotafinal((float)8.9);
    dos.setnombre("mafalda");
    dos.setNotafinal((float)6.3);
            
    if(uno.estaaprobado()==true){
        System.out.println(uno.getnombre()+"esta aprobado");
    }else{
        System.out.println(uno.getnombre()+"esta reprobado");
    }
    
}
    
}
