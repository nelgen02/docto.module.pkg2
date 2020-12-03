/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docto.module.pkg2;
import java.util.*;
/**
 *
 * @author User-pc
 */
public class DoctoModulePkg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Please enter a name:");
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      System.out.println("Your name is : "+name);
    }
    
}
