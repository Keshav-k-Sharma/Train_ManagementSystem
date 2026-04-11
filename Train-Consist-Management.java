import java.util.*;

/**
 * MAIN CLASS - UseCase1TrainConsistMgmt
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 */
public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("======================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("======================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initialization message
        System.out.println("Train initialized successfully...");

        // Display initial bogie count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display current train consist
        System.out.println("Current Train Consist : " + trainConsist);

        // Final system message
        System.out.println("\nSystem ready for operations...");
    }
}