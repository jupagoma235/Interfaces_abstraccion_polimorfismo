/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofka.com;

/**
 * Clase abstracta que representa las generalidades de la nave.
 * @author Juan Pablo Gonzalez Marin.
 */
public abstract class Ship {
    /**
     * Tiene como objetivo seleccionar el subtipo de nave.
     * @param opcion recibe la opcion elegida por el usuario.
     */
    public abstract void Ship(int opcion);
    /**
     * Tiene como objetivo traer el nombre que se le da a la nave.
     * @param name recibe el nombre configurado por el usuario y enviado al metodo.
     */
    public abstract void Name(String name);
    /**
     * Tiene como objetivo traer el nombre del pais del fabricante.
     * @param country recibe el nombre del país configurado por el usuario.
    */
    public abstract void Country(String country);
    /**
     * Determina el uso que tiene el tipo de nave elegido por el usuario.
     * @param option recibe la opcion elegida por el usuario.
     */
    public abstract void Use(int option); 
    /**
     * Determina desde donde despega la nave. 
     */
    public abstract void StartingPoint();
    /**
     * Determina el ambito de operación de la nave.
     * @param scopeoperation Recibe la opción predeterminada para la nave escogida. 
     */
    public abstract void ScopeOperation(String scopeoperation);
}
