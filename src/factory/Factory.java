/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import factory.product.Product;
import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public abstract class Factory {
  private String name;

  /**
   * @return the name
   */
  public String getName() 
  {
    return name;
  }

  /**
   * @param name the name to set
   */
  protected void setName(String name) 
  {
    this.name = name;
  }
  
  /**
   *
   * @param quantity
   * @return
   * @throws java.lang.CloneNotSupportedException
   */
  public ArrayList<Product> getProducts(int quantity) throws CloneNotSupportedException
  {
    throw new UnsupportedOperationException("Not supported yet.");
  };
}
