import java.io.* ;
import java.util.Scanner;
public class FileIO
{
  public static void main(String[] args)  throws IOException
  {
    //This is to creat a file appand and write to it 
  
    Scanner userInput= new Scanner (System.in);
    System.out.println("Enter the name of the file you want to creat");
    String fileName= userInput.nextLine();
    
    //To creat a object out of fileWriter to be able to appand and creat a print wrier to be able to use println methods
      //this is a example of file io
    FileWriter fWriter= new FileWriter(fileName, true);
    PrintWriter outputFile = new PrintWriter(fWriter); //opening the File 
    
    System.out.println("Howmany friends do you have");
    //new int variable
    int numFriend = userInput.nextInt();
      String friendName;
      for (int i = 1; i <= numFriend; i++)
    {
          System.out.println("what is the friend's " + i +"  name:");
           friendName = userInput.nextLine();
          userInput.nextLine();
          
      outputFile.println(friendName);
    }
     //just have to close the PrintWriter Class
      outputFile.close();
          System.out.println("data has been saved.");
  }
}
