/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart3day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author 6312971
 */
public class CompactDisc {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(new File("Classics.txt"));
        String title;
        String artist;
        // ADD LINES FOR TASK #3 HERE
        // Declare an array of Song objects, called cd, 
        // with a size of 6
        for (int i = 0; i < cd.length; i++)
        {
        title = input.nextLine();
        artist = input.nextLine();
        // ADD LINES FOR TASK #3 HERE
        // Fill the array by creating a new song with
        // the title and artist and storing it in the
        // appropriate position in the array
    }
    System.out.println("Contents of Classics:");
    for (int i = 0; i < cd.length; i++) {
        // ADD LINES FOR TASK #3 HERE
        // Print the contents of the array to the console
    }
    }
}
