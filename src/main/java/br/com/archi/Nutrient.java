package br.com.archi;

public class Nutrient {
  private String name;
  private double quantity;

  public Nutrient(String name, double quantity){
    this.name = name;
    this.quantity = quantity;
  }

  public String getName(){
    return name;
  }

  public double getQuantity(){
    return quantity;
  }
}
