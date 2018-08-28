//Rami Ghanem, Student Number:101000509
import java.util.*;

public class SmartGame{
  public static char[][] table = new char[5][5];  //global variable
  public static void main(String[] arg){
    System.out.println("Hello, Welcome to the 'SMART' game.");                              //greets the user
    System.out.println("Where your goal is to solve the puzzle, good lucky and have fun!"); //greets the user
    display();                                                //calls on function
 
  }
/**A function that goes through each row and column of the 2d array
  * and determine whether each row and column of the function is equal to 391.
  * To determine whether the game is complete.
  */
public static boolean end(char[][] table){   //function
    for (int row = 0; row < 5; row++){         //nested for loop to go thorugh each element of the array
      int total = 0;      // reset the total on each row
      int cTotal = 0;     //reset the total on each column
      for (int column = 0; column < 5; column++){
        total += table[row][column];      //adds up each element of the row
        cTotal += table[column][row];     //adds up each elemnt of the column
      }
      if (total != 391|| cTotal!= 391){   //check to see if each row and column is not equal 391
        return false;                     //return false
      }
      
    }
    System.out.println("Congratulation! You must be SMART."); // tells user that game is done
    return true;                                              //make function true
}
/**A function that displays and update the table contantly.
  * while gathering user input to update the table contantly.
  */
public static void display(){   //function
  table[0][0]=83;               //each is a component of the array
  table[0][1]=77;   
  table[0][2]=65;
  table[0][3]=82;
  table[0][4]=84;
  table[1][0]=32;
  table[1][1]=84;
  table[1][2]=83;
  table[1][3]=77;
  table[1][4]=32;
  table[2][0]=32;
  table[2][1]=32;
  table[2][2]=82;
  table[2][3]=32;
  table[2][4]=83;
  table[3][0]=32;
  table[3][1]=83;
  table[3][2]=77;
  table[3][3]=32;
  table[3][4]=32;
  table[4][0]=32;
  table[4][1]=32;
  table[4][2]=84;
  table[4][3]=83;
  table[4][4]=32;
  while(!end(table)){                               //While false loop continue until true
    System.out.println("    1   2   3   4   5");    //compents of the graphic
    System.out.println("  +---+---+---+---+---+");  //compents of the graphic
    for(int i = 0;i < 5 ;i++){                      //A nested for loop to go through each element of the array
      for(int j = 0;j < 5;j++){ 
        if (j == 0){                    //as it goes through the loop compares each part of the x axis to see if matches
          System.out.print((i+1)+" | ");//then adds compent to the grapichs
        }
        System.out.print(table[i][j]);  //prints out the each value of the array 
        System.out.print(" | ");        //compents of the graphic
      }
      System.out.println();                          //Cause indentation between each line
      System.out.println("  +---+---+---+---+---+"); //compents of the graphic
    }
    int userx;  //intilization of variable 
    int usery;  //intilization of variable 
    char input; //intilization of variable 
    Scanner keyboard = new Scanner(System.in);  //intilization of scanner 
    Scanner keyboard2 = new Scanner(System.in); //intilization of scanner
    Scanner reader = new Scanner(System.in);    //intilization of scanner
    
    System.out.println("Enter a row (1-5):");      //informes user what he should enter 
    while(true){                                   //While true continue to loop
      usery = keyboard.nextInt();                  //gets user input
      if(usery <= 0 || usery >= 6){                //if condtion is met perform a certain task
        System.out.println("Invalid row number!"); //gives user feed back   
      }
      else{     //if condition not met then do this
        break;  //break the loop
      }
      
    }
    System.out.println("Enter a column (1-5):");    //informes user what he should enter 
    while(true){                                    //While true continue to loop
      userx = keyboard2.nextInt();                  //gets user input
      if(userx <= 0 || userx >= 6){                 //if condtion is met perform a certain task
        System.out.println("Invalid row number!");  //gives user feed back   
      }
      else{     //if condition not met then do this
        break;  //break the loop
      }
      
    }
    System.out.println("Enter a letter (S,M,A,R or T):");                                 //informes user what he should enter 
    while(true){                                                                          //While true continue to loop
      input = reader.next().charAt(0);                                                    //gets user input
      if(input == 'S' || input == 'M' || input == 'A' || input == 'R' || input == 'T'){   //if condtion is met perform a certain task
        table[usery-1][userx-1]=input;                                                    //intilization of new point on the chart(array)
        break;                                                                            //break the loop
      }
      else{                                                                   //if condition not met then do this
        System.out.println("Invalid letter.  Use 'S', M', 'A', 'R' or 'T'."); //gives user feed back  
      }        
    }
  } 
}
}