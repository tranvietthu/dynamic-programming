# Longest Common Subsequence (Java - Dynamic Programming)

Chương trình cài đặt thuật toán **Tìm dãy con chung dài nhất (LCS - Longest Common Subsequence)** bằng ngôn ngữ **Java**, sử dụng phương pháp **Quy hoạch động (Dynamic Programming)**.

## Mô tả bài toán
Cho hai chuỗi ký tự $A$ có độ dài $m$ và $B$ có độ dài $n$. **Dãy con chung dài nhất (LCS)** là dãy ký tự xuất hiện ở cả $A$ và $B$ theo đúng thứ tự tương đối (không nhất thiết liên tiếp) và có **độ dài lớn nhất**.

## Độ phức tạp thuật toán
- **Thời gian (Time Complexity):** $O(m \times n)$
- **Không gian (Space Complexity):** $O(m \times n)$ (sử dụng bảng phương án 2 chiều `dp[m + 1][n + 1]` để tính độ dài và truy vết chuỗi kết quả)

## Cấu trúc thư mục
```text
├── .vscode/                        # Cấu hình workspace của VS Code
├── lib/                            # Thư viện ngoài (nếu có)
├── src/
│   └── LongestCommonSubsequence.java # Mã nguồn chính của thuật toán LCS
└── README.md                       # Tài liệu mô tả dự án