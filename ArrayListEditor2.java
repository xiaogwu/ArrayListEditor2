/* Xiao G. Wu
 * CCS11A - Inclass exercise on ArrayLists
 * 10/31/2011
 */

import java.util.Scanner;
import java.util.ArrayList;

/**
 * This class takes user input and tells if there is a substring of any additional user input.  If user input matches previously entered text, text is removed.
 */

public class ArrayListEditor2 {

    /**
     * Main method
     */
    
    public static void main(String[] args) {
         
        // Create an ArrayList
        ArrayList<String> editorInput = new ArrayList<String>();

        // Loop for user input using nextLine()
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        int occurrences = 0;
        while (keepGoing) {
            System.out.printf("%d: %s\n", editorInput.size(), editorInput.toString());
            System.out.printf("> ");
            String userInput = keyboard.nextLine();
            // Check for Quit condition
            if (userInput.equals("Quit") || userInput.equals("quit")) {
                keepGoing = false;
            }
            else if (editorInput.contains(userInput)) {
                int index = editorInput.indexOf(userInput);
                editorInput.remove(index); // Remove an element
            }
            else {
                occurrences = 0;
                for (String s : editorInput) {
                    if (s.indexOf(userInput) >= 0) {
                        occurrences++; 
                    } 
                } 
                if (occurrences > 0) {
                    System.out.println(occurrences + " Occurrences");
                }
                else {
                    editorInput.add(userInput); 
                }
            } 
        }
    }
}
