/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.product;

/**
 *
 * @author Adam
 */
public class Motorbike extends Product{
  public Motorbike(String model, String color, int consecutive)
  {
    super.setModel(model);
    super.setColor(color);
    super.setConsecutive(consecutive);
  }
  
  public Motorbike(){};
}
