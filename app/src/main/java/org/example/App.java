package org.example;

public class App {
    public static void main(String[] args) {
      GreetingGenerator generator = new GreetingGenerator();

      int[] N = {10, 20, 30, 40};
      int M = 10;

      for (int stepCount : N){
        System.out.println("N (Steps), M (Trials), D (Final), T (Time)");

        for(int i = 1; i <= M; i++){
          long start = System.currentTimeMillis();
          int finalPosition = generator.Steps(stepCount);
          long end= System.currentTimeMillis();
          long time = end - start;

          System.out.println(stepCount + ", " + i + ", " + finalPosition + ", " + time); 
        }
      }
      
    }
}
