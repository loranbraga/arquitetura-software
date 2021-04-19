package br.com.archi;

public class PhosporCorrection {
  private Ground ground;
  private int source;   
  private double goal;
  private double efficiency;
  private double value; // R$/ton
  private final double [] soucerValue = {18.0,41.0,48.0,45.0,18.0,33.0,29.0,32.0,24.0,18.5,52.0,18.0};

  public PhosporCorrection(Ground ground, int source, double goal, double efficiency, double value){
    this.ground = ground;
    this.source = source;
    this.goal = goal;
    this.efficiency = efficiency;
    this.value = value;
  }

  public double correction(){
    return ((this.goal - this.ground.getPhospor()) * 4.58 / this.efficiency * (100 / soucerValue[source-1]));
  }

  public double amountHec(){
    return (this.value * this.correction() / 1000) ;
  }

}
