package org.example;

public class App {
    public static void main(String[] args) {
      GreetingGenerator generator = new GreetingGenerator();

      int[] N = {10, 20, 30, 45};
      int M = 10;

      for (int stepCount : N){
        System.out.println("N (Steps), M (Trials), D (Final)");
        
        for(int i = 1; i <= M; i++){
          int finalPosition = generator.Steps(stepCount);
          System.out.println(stepCount + ", " + i + ", " + finalPosition); 
        }
      }
      
    }
}
