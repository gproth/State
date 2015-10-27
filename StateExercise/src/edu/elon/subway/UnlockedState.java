package edu.elon.subway;

public class UnlockedState implements State{
  public SubwayState subway;
  
  public UnlockedState(SubwayState subway){
    this.subway = subway;
  }
  
  @Override
  public void coin() {
    subway.output = "Thank you";
  }

  @Override
  public void pass() {
    subway.state = subway.getLocked();
    subway.output = "passed";
    
  }

}
