import re

def count_and_update_readme():
    readme_path = "README.md"
    
    # 1. Đọc nội dung file README.md
    with open(readme_path, "r", encoding="utf-8") as f:
        content = f.read()
    
    # 2. Dùng Regex tối ưu để tìm mã số bài viết (ví dụ: tìm "0001" từ "[0001-")
    # Cách này ngắn gọn và không bị lỗi xung đột ký tự đóng ngoặc vuông "]"
    matches = re.findall(r'\[(\d{4})-', content)
    
    # Lọc các ID trùng lặp bằng cách chuyển thành set
    unique_problems = set(matches)
    total_solved = len(unique_problems)
    
    print(f"Tìm thấy tổng cộng: {total_solved} bài unique.")

    # 3. Tạo chuỗi thống kê mới hiển thị ngay dưới tiêu đề chính
    stats_badge = f"\n\n### 📊 Thống kê: **{total_solved}** bài đã hoàn thành\n\n"
    
    # Xóa badge cũ nếu đã tồn tại trước đó để tránh ghi đè lặp lại
    clean_content = re.sub(r'\n*### 📊 Thống kê: \*\*\d+\*\* bài đã hoàn thành\n*', '\n', content)
    
    # Chèn badge thống kê vào ngay sau dòng tiêu đề "# LeetCode"
    if "# LeetCode" in clean_content:
        updated_content = clean_content.replace("# LeetCode", f"# LeetCode{stats_badge}", 1)
    else:
        # Nếu không tìm thấy tiêu đề gốc, chèn lên đầu file
        updated_content = stats_badge.lstrip() + clean_content

    # 4. Ghi lại vào file README.md
    with open(readme_path, "w", encoding="utf-8") as f:
        f.write(updated_content)

if __name__ == "__main__":
    count_and_update_readme()
