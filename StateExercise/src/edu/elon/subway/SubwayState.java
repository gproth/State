package edu.elon.subway;

public class SubwayState {
  String output;
  State state;
  State locked;
  State unlocked;
  
  public SubwayState() {
    locked = new LockedState(this);
    unlocked = new UnlockedState(this);
    state = locked;
    output = "";
  }

  public void pass() {
    state.pass();
  }

  public void coin() {
    state.coin();
  }
  
  public State getLocked(){
    return locked;
  }
  
  public State getUnlocked(){
    return unlocked;
  }
}
