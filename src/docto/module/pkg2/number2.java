/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docto.module.pkg2;

import static docto.module.pkg2.number2.rara;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author User-pc
 */
public class number2 {
    static Scanner Scan = new Scanner(System.in);
static LinkedList<String> rara = new LinkedList<String>();
public static void ss() {
    rara.add("Safeguard");
    rara.add("Bioderm");
    rara.add("Check");
    rara.add("Papaya");
    rara.add("Gluta");
    System.out.println("Original content of the list;"+ rara);
  /**
   * @param args the command line arguments
   */
}
public static void main(String[] args) {
    ss();
        String menu = "menu()";
}  
public static void menu() { 
      System.out.println("Select New Operation");
      System.out.println("1- Add");
      System.out.println("2- Remove");
      System.out.println("3- Search");
      System.out.println("4- Set");
      System.out.println("5- Delete");
      System.out.println("Enter Choice");
      int choice = Scan.nextInt();
      switch (choice){
          case 1:
            System.out.println("1- Add head");
            System.out.println("2- Add tail");
            System.out.println("3- Add element");
            int choice2 = Scan.nextInt();
            switch(choice2) {
            case 1:
            addhead();
            System.out.println("New content; "+ rara);
            menu();
            break;
          case 2:
            addtail();
            System.out.println("New content; "+ rara);
            menu();
            break;
          case 3:
            addelement();
            System.out.println("New content; "+ rara);
      menu();
            break;
            }
          case 2:
        System.out.println("1- Remove head");
            System.out.println("2- Remove tail");
            System.out.println("3- Remove element");
            System.out.println("3- Remove all element");
            int choice3 = Scan.nextInt();
            switch(choice3) {
                case 1:
                    removehead();
                    System.out.println("New content"+ rara);
                    menu();
                    break;
                case 2:
                    removetail();
                    System.out.println("New content"+ rara);
                    menu();
                    break;
                case 3:
                    removeelement();
                    System.out.println("New content"+ rara);
                    menu();
                    break;
                case 4:
                    removeall();
                    System.out.println("New content"+ rara);
                    menu();
                    break;
            }
          case 3:
               System.out.println("1- Get head");
               System.out.println("2- Get tail");
               System.out.println("3- Get element");
               System.out.println("4- Get size");
               int choice4 = Scan.nextInt();
               switch(choice4) {
                   case 1:
                       gethead();
                       menu();
                       break;
                   case 2:
                       gettail();
                       menu();
                       break;
                   case 3:
                       getelement();
                       menu();
                       break;
                   case 4:
                       getsize();
                       menu();
                       break;
 }
          case 4:
              System.out.println("1- Set head");
              System.out.println("2- Set tail");
              System.out.println("3- Set element");
              System.out.println("4- Set all element");
              int choice5 = Scan.nextInt();
              switch(choice5) {
                  case 1:
                      sethead();
                      System.out.println("New content"+ rara);
                      menu();
                      break;
                  case 2:
                      settail();
                      System.out.println("New content"+ rara);
                      menu();
                      break;
                  case 3:
                      setelement();
                      System.out.println("New content"+ rara);
                      menu();
                      break;
              }
              break;
              
          case 5:
              System.exit(0);
              break;
        
      }
}     
    public static String input() {
         System.out.println("Enter element");
         String Enter = Scan.next();
         return Enter;
           
    }
    private static void addhead() {
       rara.addFirst(input());
    }

    private static void addtail() {
        rara.addLast(input());
    }

    private static void addelement() {
        System.out.println("Enter position");
    }

    private static void removehead() {
       rara.removeFirst();
    }

    private static void removetail() {
        rara.removeLast();
    }

    private static void removeelement() {
        System.out.println("Enter position");
    }

    private static void removeall() {
        for(int size = rara.size();size > 0;size --) {
            System.out.println("New content; " +rara);
        }
    }

    private static void gethead() {
       System.out.println("The First Element is i"+ rara.getFirst());
    }

    private static void gettail() {
       System.out.println("The First Element is i"+ rara.getLast());
    }

    private static void getelement() {
       System.out.println("Enter position");
    }

    private static void getsize() {
        System.out.println("Enter index to change;" + rara.size());
    }

    private static void sethead() {
        String element = input();
        rara.set (0, element);
    }

    private static void settail() {
        int size = rara.size() -1 ;
        String element = input();
        rara.set (size, element);
                
    }

    private static void setelement() {
       System.out.println("Enter index to change:");
       int num = new Integer(Scan.next());
       String element = input();
       rara.add(num,element);
    }
}
