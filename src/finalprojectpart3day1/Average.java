/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart3day1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 6312971
 */
public class Average {

    private double mean;
    private int[] data;
    private int sum;
    
    public Average() {
        Scanner input = new Scanner(System.in);
        for (int numOfScoresEntered = 1; numOfScoresEntered <= 5; numOfScoresEntered++) {
            System.out.print("enter score number "+numOfScoresEntered+": ");
            int num = input.nextInt();
            sum += num;
            data[numOfScoresEntered - 1] = num;
        }
        calculateMean();
        selectionSort();
    }

    public void calculateMean() {
        this.mean = sum/5;
    }
    public void selectionSort() {
        //compare two first digits, swap if needed, then continue until done
    }
    @Override
    public String toString() {
        return data + "\n" + mean;
    }
}
