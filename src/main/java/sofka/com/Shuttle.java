/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofka.com;

import java.util.Scanner;

/**
 * Clase que representa las naves de lanzadera que sacan carga útil al espacio.
 * @author Juan Pablo Gonzalez Marin.
 */
public class Shuttle extends Ship implements IShip {
    /**
    * Se instancia objeto que captura un valor cuando se solicita al usuario.
    */
    Scanner sn = new Scanner(System.in);
    /**
     * Variable que configura el nombre de la nave.
     */
    private String name;
     /**
     * Variable que configura el pais de la nave.
     */
    private String country;
     /**
     * Variable que configura el uso que tiene el tipo de nave.
     */
    private String use;
     /**
     * Variable que configura el ambito de operación de la nave.
     */
    private String scopeoperation;
     /**
     * Variable que configura el punto de partida de la nave.
     */
    private String startingpoint;
     /**
     * Variable que configura el destino de la nave.
     */
    private String chartcourse;
     /**
     * Variable que configura el estado de la nave.
     */
    private String takeoff;
           
    /**
     * Contructor para inicializar variables.
     */
    public Shuttle() {       
        this.name = "";
        this.country = "";
        this.use = "";
        this.scopeoperation = "";
        this.startingpoint = "";
        this.chartcourse = "";
        this.takeoff = ""; 
    }

    /**
     * Imprime la configuracion de la nave.
     */    
    public void PrintShip(){
        Use(1);
        ScopeOperation("Tierra a Termosfera");
        StartingPoint();
        System.out.println("###########################################################################################");
        System.out.println("Uso de este tipo de nave : "+this.use);
        System.out.println("******************************************Propiedades**************************************");
        System.out.println("Nombre de la nave        : "+this.name);
        System.out.println("País de fabricacion      : "+this.country);
        System.out.println("Punto de partida         : "+this.startingpoint);
        System.out.println("Ambito de funcionamiento : "+this.scopeoperation);
        System.out.println("*******************************************************************************************");
        if(!"".equals(this.chartcourse)){
            System.out.println("Destino fijado           : "+this.chartcourse);            
        }
        if(!"".equals(this.takeoff)){
            System.out.println("Estado                   : "+this.takeoff);  
            System.out.println("###########################################################################################");
        }
    }
    /**
     * Metodo que determina el tipo de nave. 
     * @param opcion Capta la opción enviada por el usuario.
     */
    @Override
    public void Ship(int opcion) {
        
    }
    /**
     * Configura el nombre de la nave.
     * @param name Recibe el nombre ingresado por el usuario
     */
    @Override
    public void Name(String name) {
        this.name=name;
    }
    /**
     * Configura el país que construye la nave.
     * @param country Recibe el país ingresado por el usuario.
     */
    @Override
    public void Country(String country) {
        this.country=country;    
    }
    /**
     * Configura el uso para el que se utiliza el tipo de nave.
     * @param option Recibe la opcion que envia el usuario para determinar el uso.
     */
    @Override
    public void Use(int option) {
        use="Nave utilizada para lanzar cargas utiles al espacio";
    }
    /**
     * Configura el punto de partida de la nave
     */
    @Override
    public void StartingPoint() {
        startingpoint="Tierra";    
    }
    /**
     * COnfigura el ambito de operación de la nave.
     * @param scopeoperation Recibe el ambito de operación
     */
    @Override
    public void ScopeOperation(String scopeoperation) {
        this.scopeoperation=scopeoperation;       
    }
    /**
     * Configura el destino hacia donde se dirige la nave.
     * @param chartcourse recibe el destino para las naves que no tienen una dirección fija, en este caso no se utiliza.
     */
    @Override
    public void ChartCourse(String chartcourse) {
        this.chartcourse="Termosfera";
    }
    /**
     * Configura el estado de la nave.
     * @param optionstate Recibe la opcion que determina el estado de la nave
     */
    @Override
    public void TakeOff(int optionstate) {
        if(optionstate==1){
           if(!"".equals(this.chartcourse)){
              this.takeoff= "Despegando con rumbo hacia "+this.chartcourse;
           }
           else{
              this.takeoff="Nave en reposo";
           }
        }        
    }   

       
}
