/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.associativearraysassessmentjava;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AssociativeArraysAssessmentJava {

    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("John", 85);
        studentScores.put("Alice", 80); // Original Alice score
        studentScores.put("Mark", 78);
        studentScores.put("Sophia", 95);
        studentScores.put("Emma", 88);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name to find their score: ");
        String lookupName = scanner.nextLine();
        if (studentScores.containsKey(lookupName)) {
            System.out.println(lookupName + "'s score is: " + studentScores.get(lookupName));
        } else {
            System.out.println("Student not found.");
        }

        // Part 2: Update
        System.out.print("\nEnter student's name to update their score: ");
        String updateName = scanner.nextLine();
        if (studentScores.containsKey(updateName)) {
            System.out.print("Enter the new score: ");
            int newScore = scanner.nextInt();
            studentScores.put(updateName, newScore);
            System.out.println(updateName + "'s score updated successfully!");
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nList of students and scores:");
        for (String name : studentScores.keySet()) {
            System.out.println(name + " – " + studentScores.get(name));
        }

        scanner.close();
    }
}
