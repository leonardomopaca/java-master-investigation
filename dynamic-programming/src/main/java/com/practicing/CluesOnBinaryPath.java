package com.practicing;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CluesOnBinaryPath {
    public static int cluesOnBinaryPath(int n, int d, List<List<Integer>> roads) {
        // Write your code here
        // Initialize adjacency list
        List<int[]>[] adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        // Fill the adjacency list
        for (List<Integer> road : roads) {
            int u = road.get(0);
            int v = road.get(1);
            int c = road.get(2);
            adj[u].add(new int[]{v, c});
            adj[v].add(new int[]{u, c});
        }

        // Initialize DP table
        long[][][] dp = new long[d + 1][n + 1][1 << d];

        // Initial paths of length 1
        for (int u = 1; u <= n; u++) {
            for (int[] edge : adj[u]) {
                int v = edge[0];
                int c = edge[1];
                dp[1][u][1 << c]++;
            }
        }

        // Fill DP table
        for (int k = 1; k < d; k++) {
            for (int u = 1; u <= n; u++) {
                for (int s = 0; s < (1 << k); s++) {
                    if (dp[k][u][s] > 0) {
                        for (int[] edge : adj[u]) {
                            int v = edge[0];
                            int c = edge[1];
                            dp[k + 1][v][(s << 1) | c] += dp[k][u][s];
                        }
                    }
                }
            }
        }

        // Sum up the number of paths of length d starting from each house
        long result = 0;
        for (int u = 1; u <= n; u++) {
            for (int s = 0; s < (1 << d); s++) {
                result += dp[d][u][s];
            }
        }

        return (int) result;
    }

}

