/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos. 
 */
package herenciaej02.entities;

import java.util.Scanner;

/**
 *
 * @author guzma
 */
public class Televisor extends Electrodomestico {

    private double resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return "Televisor:" + super.toString() + ", resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }

    public Televisor crearTelevisor() {

        Televisor t1 = new Televisor();

        System.out.println("Crear televisor:");
        System.out.println("");

        t1.crearElectrodomestico();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la resolucion del televisor (en pulgadas): ");
        double resolucion = leer.nextDouble();
        t1.setResolucion(resolucion);

        System.out.println("¿El televisor posee un sintonizador TDT?");
        String posee = leer.next();

        if (posee.equalsIgnoreCase("si")) {
            t1.setTDT(true);
        } else {
            t1.setTDT(false);
        }
       
        double precio = t1.precioFinal();
        t1.setPrecio(precio);

        return t1;
    }

    @Override
    public double precioFinal() {

        double precio = super.precioFinal();

        if (resolucion > 40d) {
            precio = precio * 1.3;
        }

        if (TDT) {
            precio += 500d;
        }
        
        return precio;
    }

}
