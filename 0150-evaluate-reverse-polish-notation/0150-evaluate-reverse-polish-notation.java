import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // Kiểm tra xem token có phải là toán tử không
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                // Lấy 2 toán hạng ra khỏi stack
                int b = stack.pop(); // Toán hạng sau
                int a = stack.pop(); // Toán hạng trước

                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        // Phép chia trong Java mặc định làm tròn về 0 với kiểu int
                        stack.push(a / b);
                        break;
                }
            } else {
                // Nếu là số, đổi từ String sang Integer và đẩy vào stack
                stack.push(Integer.parseInt(token));
            }
        }

        // Kết quả cuối cùng nằm ở đỉnh stack
        return stack.pop();
    }
}