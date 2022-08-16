package com.election;

import java.util.Scanner;

public class VoterImpl {
    public static void main(String[] args) {
         Voter voter = new Voter();
         Scanner obj = new Scanner(System.in);
        System.out.println( " Input name : ");
        String name = obj.nextLine();
        System.out.println(" Input age : ");
         int age= obj.nextInt();
         voter.setAge(age);
         voter.setName(name);
        System.out.println("voter.getAgeCriteria(25) = " + voter.getAgeCriteria(age));
    }
}
