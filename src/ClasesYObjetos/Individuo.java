package ClasesYObjetos;

public class Individuo {
    private String nombre;
    private int edad;
    private String rut;
    private char sexo;
    private float peso;
    private float altura;
    
    public Individuo(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=comprobarSexo(sexo);
    }
    
    public Individuo(String nombre, int edad, char sexo, String rut, float peso, float altura){
        this(nombre,edad,sexo);
        this.rut=rut;
        this.peso=peso;
        this.altura=altura;
    }
    
    public byte calcularIMC(){
        float imc=this.peso/(this.altura*this.altura);
        if(imc>25){
            return 1;
        }
        if(imc>=20){
            return 0;
        }
        return -1; 
    }
    
    public boolean esMayorDeEdad(){
        return this.edad>=18; 
    }
    
    private char comprobarSexo(char sexo){
        sexo=Character.toUpperCase(sexo);
        if(sexo != 'H') //probar sin los {}
            return 'M';
        
        return sexo;
    }
    
    public Individuo(){
        this("",0,'M');
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRut() {
        return rut;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    
    
    
    
    
    
    
    
}
