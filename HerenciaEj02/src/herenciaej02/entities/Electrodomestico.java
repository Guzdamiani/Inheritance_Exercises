/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
13
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. 
 */
package herenciaej02.entities;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char letra, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(letra);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char letra) {
        this.consumoEnergetico = comprobarConsumoEnergetico(letra);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso;
    }

    public char comprobarConsumoEnergetico(char letra) {

        letra = Character.toUpperCase(letra);
        
        switch (letra) {
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            case 'E':
                break;
            default:
                letra = 'F';
        }

        return letra;
    }

    public String comprobarColor(String color) {

        switch (color) {
            case "negro":
                break;
            case "rojo":
                break;
            case "azul":
                break;
            case "gris":
                break;
            default:
                color = "blanco";
        }

        return color;
    }

    public void crearElectrodomestico() { 

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Color: ");
        String color = leer.next().toLowerCase();
        color = comprobarColor(color);
        setColor(color);

        System.out.println("Consumo energético (A a la F): ");
        char letra = leer.next().charAt(0);
        letra = comprobarConsumoEnergetico(letra);
        setConsumoEnergetico(letra);

        System.out.println("Peso (en kg): ");
        double peso = leer.nextDouble();
        setPeso(peso);

    }

    public double precioFinal() {

        double precio = 1000d;

        switch (consumoEnergetico) {
            case 'A':
                precio += 1000d;
                break;
            case 'B':
                precio += 800d;
                break;
            case 'C':
                precio += 600d;
                break;
            case 'D':
                precio += 500d;
                break;
            case 'E':
                precio += 300d;
                break;
            case 'F':
                precio += 100d;
                break;
        }

        if (peso <= 19d) {
            precio += 100d;
        } else if (peso >= 20d && peso <= 49d) {
            precio += 500d;
        } else if (peso >= 50d && peso <= 79d) {
            precio += 800d;
        } else {
            precio += 1000d;
        }
        
        return precio;
    }
}
