package com.javaworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player1 player1 = new Player1("Abhay", "sword", 100);
        Player2 player2 = new Player2("Sharat", "Ak-47", 100, true);
        Scanner scanner = new Scanner(System.in);
        int action=0;
        int gun=0;
        while (player1.getHealth() > 0 && player2.getHealth() > 0 && action!=5) {
            System.out.println("Enter the action");
            System.out.println("1. Shoot player 2");
            System.out.println("2. Shoot player 1");
            System.out.println("3. Heal player 1");
            System.out.println("4. Heal player 2");
            System.out.println("5. Quit :(");
            action = scanner.nextInt();
            switch (action){
                case 1:
                    System.out.println("With which gun?");
                    System.out.println("1. Gun 1");
                    System.out.println("2. Gun 2");
                    gun= scanner.nextInt();
                    switch (gun){
                        case 1:
                            player2.damageByGun1();
                            break;
                        case 2:
                            player2.damageByGun2();
                            break;
                        default:
                            System.out.println("Invalid choice");
                        }
                    break;
                case 2:
                    System.out.println("With which gun?");
                    System.out.println("1. Gun 1");
                    System.out.println("2. Gun 2");
                    gun= scanner.nextInt();
                    switch (gun){
                        case 1:
                            player1.damageByGun1();
                            break;
                        case 2:
                            player1.damageByGun2();
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                case 3:
                    player1.heal();
                    break;
                case 4:
                    player2.heal();
                    break;
                case 5:
                    break;
            }
        }
    }
}
