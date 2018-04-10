/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac41cliente;

/**
 *
 * @author entrar
 */
public class Ac41Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contactos cliente = new Contactos();
        System.out.println(cliente.findAll_JSON(String.class));
        
    }
    
}
