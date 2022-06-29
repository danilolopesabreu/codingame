package easy;

import java.util.Scanner;


/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
public class Decent {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        // game loop
        while (true) {
            
            int tall = Integer.MIN_VALUE;
            int positionToDestroy = -1;

            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if(mountainH >= 0 && mountainH <= 9){
                   if(tall < mountainH){
                    tall = mountainH;
                    positionToDestroy = i;
                   }
                }
            }

            if(positionToDestroy >= 0)
                System.out.println(positionToDestroy); // The index of the mountain to fire on.
            
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

        }
    }

}
