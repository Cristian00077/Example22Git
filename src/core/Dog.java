
package core;

public class Dog {
    private String nombre;
    private String raza;
    private String edad;

    public Dog(String nombre, String raza, String edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  "nombre= " + nombre + ", raza= " + raza + ", edad= " + edad;
    }
    
}
