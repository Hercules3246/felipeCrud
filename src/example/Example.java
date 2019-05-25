/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author Home
 */
public class Example {
    
   private String word;
    
    public String reverseWord(String word) {
        StringBuffer w = new StringBuffer(word);
        return w.reverse().toString();
    }
    
    public static void main(String[] args) {
      Example e = new Example();
      String word = "hola";
      String rever = e.reverseWord(word);
      if (word.equalsIgnoreCase(rever)) {
          System.out.println("Son iguales");
      } else {
          System.out.println("No son iguales");
      }
    }
}
