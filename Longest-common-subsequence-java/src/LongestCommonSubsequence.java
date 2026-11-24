import java.util.Scanner;

public class LongestCommonSubsequence {

    public static String findLCS(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];

        // 1. Xây dựng bảng quy hoạch động
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // 2. Truy vết ngược từ dp[m][n] để lấy chuỗi LCS
        StringBuilder lcs = new StringBuilder();
        int i = m;
        int j = n;

        while (i > 0 && j > 0) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                lcs.append(a.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi thu nhat (A): ");
        String a = scanner.nextLine();

        System.out.print("Nhap chuoi thu hai (B): ");
        String b = scanner.nextLine();

        String lcs = findLCS(a, b);
        System.out.println("Do dai LCS: " + lcs.length());
        System.out.println("Day con chung dai nhat: " + lcs);

        scanner.close();
    }
}