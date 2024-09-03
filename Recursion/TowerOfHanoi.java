package Recursion;

public class TowerOfHanoi {

    public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {  // Base case
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        
        // Move n-1 disks from the source rod to the auxiliary rod
        solveHanoi(n - 1, fromRod, auxRod, toRod);
        
        // Move the nth disk from the source rod to the destination rod
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        
        // Move the n-1 disks from the auxiliary rod to the destination rod
        solveHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int numDisks = 3;
        solveHanoi(numDisks, 'A', 'C', 'B');
    }

    
}
