package com.practicing;

public class InputGenerator {

    public static void main(String[] args) {
        generateSmallCases();
        generateMediumCases();
//        generateLargeCases();
//        generateEdgeCases();
    }

    public static void generateSmallCases() {
        // Example 1: Small N
        System.out.println("generateTree(4, 2)");
        generateTree(4, 2);  // Small tree, M=2
        System.out.println("generateTree(4, 3)");
        generateTree(4, 3);  // Small tree, M=3
    }

    public static void generateMediumCases() {
        // Example 2: Medium N
        System.out.println("generateTree(10, 1)");
        generateTree(10, 1);  // Medium tree, M=1
        System.out.println("generateTree(10, 3)");
        generateTree(10, 3);  // Medium tree, M=3
    }

    public static void generateLargeCases() {
        // Example 3: Large N
        generateTree(100, 4);  // Large tree, M=4
        generateTree(1000, 5); // Large tree, M=5
    }

    public static void generateEdgeCases() {
        // Minimum edge case
        generateTree(1, 1);    // N = 1, trivial case

        // Maximum edge case
        generateTree(100000, 5);  // N = 100000, maximum M=5
    }

    public static void generateTree(int n, int m) {
        System.out.println(n + " " + m);
        // Generate a connected tree for N nodes
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " + (i - 1));  // Chain form: 1-2-3-...-N
        }
    }
}

