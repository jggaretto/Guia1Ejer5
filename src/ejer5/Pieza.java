/*
En un nuevo proyecto para un juego de ajedrez, nos piden modelar e implementar una clase
que representa una Pieza de dicho juego. Usted deberá pensar que atributos serían
necesarios para describir las características de dicha clase, agregarle los métodos getter y
setter correspondientes y luego probar desde el main de la clase principal del proyecto.
 */
package ejer5;


public class Pieza {
    private String nombre;
    private String color;
    private int posX;
    private int posY;
    
    public Pieza() {
        // Constructor vacío
    }
    
    public Pieza(String nombre, String color, int posX, int posY) {
        this.nombre = nombre;
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getPosX() {
        return posX;
    }
    
    public void setPosX(int posX) {
        this.posX = posX;
    }
    
    public int getPosY() {
        return posY;
    }
    
    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Color: " + this.color);
        System.out.println("Posición X: " + this.posX);
        System.out.println("Posición Y: " + this.posY);
    }
}
