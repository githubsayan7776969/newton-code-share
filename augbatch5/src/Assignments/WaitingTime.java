package Assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class WaitingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NoOfPatiesnt = sc.nextInt();
        int time = sc.nextInt();
        System.out.println(NoOfPatiesnt * time);
    }
}