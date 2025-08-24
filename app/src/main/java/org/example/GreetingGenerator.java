package org.example;
import java.util.Random;

public class GreetingGenerator {

  public int Coinflip() {
    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextBoolean() ? 1 : -1;

    return randomNumber;
  }

  public int Steps(int step){
    int currentPosition = 0;
    
    for (int i = 0; i < step; i++){
      currentPosition += Coinflip();
    }

    return currentPosition;
  }

}
