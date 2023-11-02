/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos. 
 */
package herenciaej02;

import herenciaej02.entities.Lavadora;
import herenciaej02.entities.Televisor;

/**
 *
 * @author guzma
 */
public class HerenciaEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Lavadora l1 = new Lavadora();
       Televisor t1 = new Televisor();
       
       l1 = l1.crearLavadora();
       t1 = t1.crearTelevisor();
       
        System.out.println(l1.toString());
        System.out.println("");
        
        System.out.println("");
        System.out.println(t1.toString());
        
    }
    
}
