/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofka.com;

import java.util.Scanner;

/**
 * Clase que representa las naves tripuladas.
 * @author Juan Pablo Gonzalez Marin.
 */
public class Manned extends Ship implements IShip {

  /**
    * Se instancia objeto que captura un valor cuando se solicita al usuario.
    */
    Scanner snman = new Scanner(System.in);
    /**
     * Variable que configura el nombre de la nave.
     */
    private String nameman;
     /**
     * Variable que configura el pais de la nave.
     */
    private String countryman;
     /**
     * Variable que configura el uso que tiene el tipo de nave.
     */
    private String useman;
     /**
     * Variable que configura el ambito de operación de la nave.
     */
    private String scopeoperationman;
     /**
     * Variable que configura el punto de partida de la nave.
     */
    private String startingpointman;
     /**
     * Variable que configura el destino de la nave.
     */
    private String chartcourseman;
     /**
     * Variable que configura el estado de la nave.
     */
    private String takeoffman;
           
    /**
     * Contructor para inicializar variables.
     */
    public Manned() {       
        this.nameman = "";
        this.countryman = "";
        this.useman = "";
        this.scopeoperationman = "";
        this.startingpointman = "";
        this.chartcourseman = "";
        this.takeoffman = ""; 
    }

    /**
     * Imprime la configuracion de la nave.
     */    
    public void PrintShip(){
        
        System.out.println("###########################################################################################");
        System.out.println("Uso de este tipo de nave : "+this.useman);
        System.out.println("******************************************Propiedades**************************************");
        System.out.println("Nombre de la nave        : "+this.nameman);
        System.out.println("País de fabricacion      : "+this.countryman);
        System.out.println("Punto de partida         : "+this.startingpointman);
        System.out.println("Ambito de funcionamiento : "+this.scopeoperationman);
        System.out.println("*******************************************************************************************");
        if(!"".equals(this.chartcourseman)){
            System.out.println("Destino fijado           : "+this.chartcourseman);            
        }
        if(!"".equals(this.takeoffman)){
            System.out.println("Estado                   : "+this.takeoffman);  
            System.out.println("###########################################################################################");
        }
    }
    /**
     * Metodo que determina el tipo de nave. 
     * @param opcion Capta la opción enviada por el usuario.
     */
    @Override
    public void Ship(int opcion) {
        switch (opcion){
            case 1:
                this.scopeoperationman="Termosfera a la luna";
                break;
            default:
                this.scopeoperationman="Termosfera";
                break;
        }
    }
    /**
     * Configura el nombre de la nave.
     * @param name Recibe el nombre ingresado por el usuario
     */
    @Override
    public void Name(String name) {
        this.nameman=name;
    }
    /**
     * Configura el país que construye la nave.
     * @param country Recibe el país ingresado por el usuario.
     */
    @Override
    public void Country(String country) {
        this.countryman=country;  
        StartingPoint();
    }
    /**
     * Configura el uso para el que se utiliza el tipo de nave.
     * @param option Recibe la opcion que envia el usuario para determinar el uso.
     */
    @Override
    public void Use(int option) {
        switch (option){
            case 1:
                useman="Misiones Lunares";
                break;
            case 2:                
                useman="Experimentación y estudio del comportamiento humano en condiciones ingrávidas y en el exterior de la cápsula";
                break;
            case 3:
                useman="Mantenimiento de satélites, probar acoplamientos con otras naves y equipos electrónicos";
                break;
            default:
                break;
        }        
    }
    /**
     * Configura el punto de partida de la nave
     */
    @Override
    public void StartingPoint() {
        startingpointman="Termosfera";    
    }
    /**
     * COnfigura el ambito de operación de la nave.
     * @param scopeoperation Recibe el ambito de operación
     */
    @Override
    public void ScopeOperation(String scopeoperation) {
        this.scopeoperationman=scopeoperation;       
    }
    /**
     * Configura el destino hacia donde se dirige la nave.
     * @param chartcourse recibe el destino para las naves que no tienen una dirección fija, en este caso no se utiliza.
     */
    @Override
    public void ChartCourse(String chartcourse) {
        if("Termosfera a la luna".equals(this.scopeoperationman)){
           this.chartcourseman="Luna";
        }else{
           this.chartcourseman="Orbitando la termosfera";
    
        }
    }
    /**
     * Configura el estado de la nave.
     * @param optionstate Recibe la opcion que determina el estado de la nave
     */
    @Override
    public void TakeOff(int optionstate) {
        if(optionstate==1){
           if(!"".equals(this.chartcourseman)){
              this.takeoffman= "Despegando con rumbo hacia "+this.chartcourseman;
           }
           else{
              this.takeoffman="Nave en reposo";
           }
        }        
    }   

          
}
