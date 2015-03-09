/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorbike.prototype;

import factory.*;
import factory.product.*;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Client {

  /**
   * @param args the command line arguments
   * @throws java.lang.CloneNotSupportedException
   */
  public static void main(String[] args) throws CloneNotSupportedException {
    Ducati ducati = new Ducati();
    
    ArrayList<Product> motorbikes = ducati.getProducts(10);
    for (Product motorbike : motorbikes)
    {
      System.out.println("Motorbike consecutive: " + motorbike.getConsecutive());
    }
    
    ArrayList<Product> moreMotorbikes = ducati.getProducts(5);
    for (Product moreMotorbike : moreMotorbikes)
    {
      System.out.println("Motorbike consecutive: " + moreMotorbike.getConsecutive());
    }
  }
  
}
