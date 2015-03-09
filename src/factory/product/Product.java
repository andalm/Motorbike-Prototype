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
public abstract class Product implements Cloneable{
  private String model;
  private String color;
  private int consecutive;
  
  @Override
  public Product clone() throws CloneNotSupportedException
  {
    return (Product) super.clone();
  }

  /**
   * @return the model
   */
  public String getModel()
  {
    return model;
  }

  /**
   * @param model the model to set
   */
  public void setModel(String model)
  {
    this.model = model;
  }

  /**
   * @return the color
   */
  public String getColor()
  {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(String color)
  {
    this.color = color;
  }

  /**
   * @return the consecutive
   */
  public int getConsecutive()
  {
    return consecutive;
  }

  /**
   * @param consecutive the consecutive to set
   */
  public void setConsecutive(int consecutive)
  {
    this.consecutive = consecutive;
  }
}