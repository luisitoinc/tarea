
package ClasesYObjetos;

public class Estudiante {
    private String nombre;
    private float Notafinal; 
    
public String getnombre(){
    return this.nombre;
}

public float getNotafinal(){
    return this.Notafinal;
}

public void setnombre(String nuevo){
    this.nombre=nuevo;
}

public void setNotafinal(float nuevo){
    this.Notafinal=nuevo;
}

public boolean estaaprobado(){
    if(this.Notafinal>=4.0){
        return true;
    }else{
        return false;
    }
}

   


}
