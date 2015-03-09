/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import factory.product.*;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class Ducati extends Factory{
  private static int consecutive = 0;
  private Product product = new Motorbike("899 Panigale", "Blue", consecutive);
  
  public Ducati()
  {
    super.setName("Ducati");
  }

  /**
   * @param quantity
   * @return the product
   * @throws java.lang.CloneNotSupportedException
   */
  @Override
  public ArrayList<Product> getProducts(int quantity) throws CloneNotSupportedException
  {
    ArrayList<Product> products = new ArrayList<>();    
    while(quantity > 0)
    {
      consecutive++;
      Product newProduct = product.clone();
      newProduct.setConsecutive(consecutive);
      products.add(newProduct);
      quantity--;
    }
    return products;
  }
  
}
