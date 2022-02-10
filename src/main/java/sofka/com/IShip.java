/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofka.com;
/**
 * Interface que represeta las acciones de la nave.
 * @author Juan Pablo Gonzalez Marin.
 */
public interface IShip {
  /**
   * Tiene como objetivo determinar el destino para trazar el curso.
     * @param chartcourse recibe el destino para los objetos que no tienen un punto fijo
   */  
  public void ChartCourse(String chartcourse);
  /**
   * Determina si la nave despega y se coloca en movimiento.
   * @param optionstate Recibe la opcion que determina si se da el despegue o no.
   */
  public void TakeOff(int optionstate);
  
}
