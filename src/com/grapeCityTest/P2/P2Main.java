package com.grapeCityTest.P2;

import com.grapeCityTest.P2.util.Command;

import java.util.Scanner;

public class P2Main {
    public static Command read(){
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        String[] arrs = new String[i+1];
        for(int j=0;j<arrs.length;j++){
            arrs[j] = scanner.nextLine();
        }
        return new Command(i,arrs);
    }
    public static void main(String[] args) {
        Command c = read();
        Controller controller = new Controller(c);
        Frame frame = new Frame(controller);
        frame.printTable();
    }
}
