package edu.elon.subway;

public class LockedState implements State{
  public SubwayState subway;
  
  public LockedState(SubwayState subway){
    this.subway = subway;
  }
  
  @Override
  public void coin() {
    subway.state = subway.getUnlocked();
    subway.output = "coin accepted";
  }

  @Override
  public void pass() {
    subway.output = "Alarm";
    
  }
 

}
