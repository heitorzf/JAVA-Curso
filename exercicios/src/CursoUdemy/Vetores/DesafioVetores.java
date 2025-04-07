package Vetores;

import entities.RoomRent;

import java.util.Scanner;

public class DesafioVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name , Email;
        System.out.println("How many rooms will be rented??");
        int amountRent = sc.nextInt();
        sc.nextLine();
        RoomRent[] vetor = new RoomRent[10];
        for ( int i = 0 ; i < amountRent ; i++) {
            System.out.println("Rent #" + (i+1));
            System.out.println("Name:");
            name = sc.nextLine();
            System.out.println("Email:");
            Email = sc.nextLine();
            System.out.println("Room:");

            int room = sc.nextInt();
            sc.nextLine();
            if ( vetor[room] != null)
                System.out.println("This room is occupied");
            else if (vetor[room] == null){
                vetor[room] = new RoomRent(name , Email);
            }


        }
        System.out.println("Busy rooms: ");
        for (int i = 0 ; i < vetor.length ; i++)
        {
            if (vetor[i] != null) {
                System.out.println(i + ":" + vetor[i].toString());
            }
        }
    }
}
