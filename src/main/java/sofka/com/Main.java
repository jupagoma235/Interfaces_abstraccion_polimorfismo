/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofka.com;

import java.util.Scanner;

/**
 * @author Juan Pablo Gonzalez Marin.
 */
public class Main {

    /**
     * Metodo Main en donde se desarrolla el llamado a las clases.
     * @param args variable standard para el metodo main
     */
    public static void main(String[] args) {
        /**
         * Creacion de un nuevo objeto de la clase Shuttle.
         */
        Shuttle ShipShuttle = new Shuttle();
        /**
         * Creacion de un nuevo objeto de la clase UmManned.
         */
        UnManned ShipUnManned = new UnManned();
        /**
         * Creacion de un nuevo objeto de la clase Manned.
         */
        Manned ShipManned = new Manned();
        /**
         * Se instancia objeto que captura un valor número cuando se solicita al usuario.
         */
        Scanner sn = new Scanner(System.in);
        /**
         * Se instancia objeto que captura un valor string cuando se solicita al usuario.
         */
        Scanner sns = new Scanner(System.in);
        /**
         * Variable que recoge las opciones de seleccion.
         */
        String wildcard= "";
        /**
         * Variable que recoge el valor seleccionado por el usuario para determinar la nave en el evento que se requiera.
         */
        int tipeship = 0;
        /**
         * Variable que regoge las opciones de seleccion del usuario para el metodo while.
         */
        int opcwhile=0;
        /**
         * Variable que recoge las opciones de seleccion del usuario para el metodo switch.
         */
        int opcswitch=0;
        
        while(opcwhile==0){
            
            System.out.println("Bienvenido al sistema de selección de naves espaciales");
            System.out.println("Seleccione el tipo de nave 1)Lanzadera, 2)No tripulada, 3)Tripulada");
            
            opcswitch=sn.nextInt();
            switch(opcswitch){
                case 1:
                    tipeship=1;
                    ShipShuttle.Ship(opcswitch);
                    System.out.println("Asigne un nombre a la nave : ");
                    wildcard=sns.nextLine();
                    ShipShuttle.Name(wildcard);
                    System.out.println("País del fabricante        : ");
                    wildcard=sns.nextLine();
                    ShipShuttle.Country(wildcard);
                    break;
                case 2:
                    tipeship=2;
                    System.out.println("Su nave debe ser 1)Exploración, 2)Mantenimiento y correccion");
                    opcswitch=sn.nextInt();
                    if(opcswitch==1){ShipUnManned.Ship(opcswitch);}
                    if(opcswitch==2){ShipUnManned.Ship(opcswitch);}
                    System.out.println("Asigne un nombre a la nave : ");
                    wildcard=sns.nextLine();
                    ShipUnManned.Name(wildcard);
                    System.out.println("País del fabricante        : ");
                    wildcard=sns.nextLine();
                    ShipUnManned.Country(wildcard);
                    break;
                case 3:                    
                    tipeship=3;
                    System.out.println("Su nave debe ser 1)Misiones lunares, 2)Exploración, 3)Mantenimiento");
                    opcswitch=sn.nextInt();
                    if(opcswitch==1){ShipManned.Ship(opcswitch);ShipManned.Use(opcswitch);}
                    if(opcswitch==2){ShipManned.Ship(opcswitch);ShipManned.Use(opcswitch);}
                    if(opcswitch==3){ShipManned.Ship(opcswitch);ShipManned.Use(opcswitch);}
                    System.out.println("Asigne un nombre a la nave : ");
                    wildcard=sns.nextLine();
                    ShipManned.Name(wildcard);
                    System.out.println("País del fabricante        : ");
                    wildcard=sns.nextLine();
                    ShipManned.Country(wildcard);
                    break;
                default:
                    break;
            }
            System.out.println("Tiene una nave en su garage, si desea verla ingrese S :");
            wildcard=sns.nextLine();
            if("S".equals(wildcard) || "s".equals(wildcard)){
                switch (tipeship){
                    case 1:
                        ShipShuttle.PrintShip();
                        break;
                    case 2:
                        ShipUnManned.PrintShip();
                        break;
                    case 3:
                        ShipManned.PrintShip();
                        break;
                    default:
                        break;
                }
            }wildcard="";
           
            switch (tipeship){
                case 1:
                    ShipShuttle.ChartCourse("");
                    System.out.println("Si desea despegar oprima S :   ");
                    wildcard=sns.nextLine();
                    if("S".equals(wildcard) || "s".equals(wildcard)){ShipShuttle.TakeOff(1);}wildcard="";
                    ShipShuttle.PrintShip();
                    break;
                case 2:
                    System.out.println("Si desea fijar curso oprima S :   ");
                    wildcard=sns.nextLine();            
                    if("S".equals(wildcard) || "s".equals(wildcard)){
                        System.out.println("Seleccione planeta de destino :   ");
                        wildcard=sns.nextLine();
                        ShipUnManned.ChartCourse(wildcard);
                    }wildcard="";
                    System.out.println("Si desea despegar oprima S :   ");
                    wildcard=sns.nextLine();
                    if("S".equals(wildcard) || "s".equals(wildcard)){ShipUnManned.TakeOff(1);}wildcard="";
                    ShipUnManned.PrintShip();
                    break;
                case 3:
                    ShipManned.ChartCourse("");
                    System.out.println("Si desea despegar oprima S :   ");
                    wildcard=sns.nextLine();
                    if("S".equals(wildcard) || "s".equals(wildcard)){ShipManned.TakeOff(1);}wildcard="";
                    ShipManned.PrintShip();
                    break;
                default:
                    break;
            }
            wildcard="";
            opcwhile=0;
            opcswitch=0;
            System.out.println("Si desea continuar seleccione 1)Seguir, 2)Salir");
            opcswitch=sn.nextInt();
            if(opcswitch==2){opcwhile=1;}
        }
        
    }
    
}
