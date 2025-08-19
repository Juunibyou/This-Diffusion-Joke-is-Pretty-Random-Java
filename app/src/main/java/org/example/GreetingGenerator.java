package org.example;
import java.util.Random;

public class GreetingGenerator {
  // This is just an example class to demonstrate how everything works
  // You should delete this file when you implement your own solution

  //N = number of steps = 10
  //M = number of trial = 10
  //D = Final Position


  public int Coinflip() {
    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(2);

    return randomNumber;
  }
}
