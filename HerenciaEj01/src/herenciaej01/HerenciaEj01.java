/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. 
 */
package herenciaej01;

import herenciaej01.entities.Animal;
import herenciaej01.entities.Caballo;
import herenciaej01.entities.Gato;
import herenciaej01.entities.Perro;

/**
 *
 * @author guzma
 */
public class HerenciaEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Declaracion del objeto Perro
        Animal perro1 = new Perro("Tobias", "Pollo", 7, "Labrador");
        perro1.Alimentarse();
        System.out.println("");

        //Declaracion del objeto Gato
        Animal gato1 = new Gato("Michi", "Ración", 4, "Siamés");
        gato1.Alimentarse();
        System.out.println("");

        //Declaracion del objeto Gato
        Animal caballo1 = new Caballo("Spirit", "Pasto", 9, "Pura Sangre");
        caballo1.Alimentarse();
        System.out.println("");
    }

}
