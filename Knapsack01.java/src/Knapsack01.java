import java.util.Scanner;

public class Knapsack01 {

    public static int solveKnapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            int w = weights[i - 1];
            int v = values[i - 1];

            for (int c = 0; c <= capacity; c++) {
                if (w <= c) {
                    dp[i][c] = Math.max(dp[i - 1][c], dp[i - 1][c - w] + v);
                } else {
                    dp[i][c] = dp[i - 1][c];
                }
            }
        }

        return dp[n][capacity];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong do vat (n): ");
        int n = scanner.nextInt();

        System.out.print("Nhap suc chua toi da cua tui (W): ");
        int capacity = scanner.nextInt();

        int[] weights = new int[n];
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Do vat %d - Nhap trong luong (w) va gia tri (v): ", i + 1);
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }

        int maxValue = solveKnapsack(weights, values, capacity);
        System.out.println("Gia tri lon nhat dat duoc: " + maxValue);

        scanner.close();
    }
}