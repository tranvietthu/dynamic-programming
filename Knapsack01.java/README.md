# 0/1 Knapsack Problem (Java - Dynamic Programming)

Chương trình cài đặt thuật toán giải bài toán **Cái túi 0/1 (0/1 Knapsack)** bằng ngôn ngữ **Java**, sử dụng phương pháp **Quy hoạch động (Dynamic Programming)**.

##  Mô tả bài toán
Cho $n$ đồ vật, mỗi đồ vật thứ $i$ có trọng lượng $w_i$ và giá trị $v_i$. Với một chiếc túi có sức chứa tối đa $W$, hãy chọn ra một tập hợp các đồ vật sao cho:
- Tổng trọng lượng các đồ vật được chọn không vượt quá $W$.
- Tổng giá trị thu được là **lớn nhất**.
- Mỗi đồ vật chỉ được chọn tối đa **1 lần** (chọn hoặc không chọn).

## Độ phức tạp thuật toán
- **Thời gian (Time Complexity):** $O(n \times W)$
- **Không gian (Space Complexity):** $O(n \times W)$ (sử dụng bảng phương án 2 chiều `dp[n + 1][W + 1]`)

##  Cấu trúc thư mục
```text
├── .vscode/          # Cấu hình workspace của VS Code
├── lib/              # Thư viện ngoài (nếu có)
├── src/
│   └── Knapsack01.java   # Mã nguồn chính của thuật toán
└── README.md         # Tài liệu mô tả dự án