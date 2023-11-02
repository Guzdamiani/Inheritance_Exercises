/*
 Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package herenciaej02;

import herenciaej02.entities.Electrodomestico;
import herenciaej02.entities.Lavadora;
import herenciaej02.entities.Televisor;
import java.util.ArrayList;

/**
 *
 * @author guzma
 */
public class HerenciaEj03 {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();

        listaElectrodomesticos.add(new Lavadora(30, 1000, "rojo", 'B', 40));
        listaElectrodomesticos.add(new Lavadora(20, 1000, "verde", 'G', 50));
        listaElectrodomesticos.add(new Televisor(40, true, 0, "blanco", 'A', 20));
        listaElectrodomesticos.add(new Televisor(50, false, 500, "azul", 'C', 10));

        double sumaElectro = 0;
        double sumaLavadoras = 0;
        double sumaTele = 0;
        int contLav = 1;
        int contTele = 1;

        for (Electrodomestico aux : listaElectrodomesticos) {

            aux.setPrecio(aux.precioFinal());

            sumaElectro += aux.precioFinal();

            if (aux instanceof Lavadora) {
                System.out.println("El precio final de el/la " + aux.getClass().getSimpleName() + " nº " + contLav + " es " + aux.getPrecio() + "$");
                sumaLavadoras += aux.getPrecio();
                contLav++;
            } else if (aux instanceof Televisor) {
                System.out.println("El precio final de el/la " + aux.getClass().getSimpleName() + " nº " + contTele + " es " + aux.getPrecio() + "$");
                sumaTele += aux.getPrecio();
                contTele++;
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Precio total de Electrodomésticos: " + sumaElectro + "$");
        System.out.println("Precio total de Lavadoras: " + sumaLavadoras + "$");
        System.out.println("Precio total de Televisores: " + sumaTele + "$");

    }

}
