# Thiết kế tài nguyên RESTful API - Quản lý Bác sĩ (Doctors)

## 1. Nguyên tắc áp dụng
- Sử dụng danh từ số nhiều cho tên tài nguyên: `doctors`
- Không sử dụng động từ trên URL (Ví dụ: tránh `/getAllDoctors`, `/createDoctor`).
- Sử dụng đúng các HTTP Method tương ứng với từng thao tác CRUD (`GET`, `POST`, `PUT`, `DELETE`).

## 2. Danh sách 5 API chuẩn RESTful

| STT | Thao tác nghiệp vụ                        | HTTP Method | Endpoint (URL) | Mô tả |
| :--- |:------------------------------------------| :--- | :--- | :--- |
| 1 | Lấy danh sách toàn bộ bác sĩ              | `GET` | `/api/v1/doctors` | Trả về danh sách tất cả bác sĩ trong hệ thống |
| 2 | Lấy thông tin chi tiết một bác sĩ theo ID | `GET` | `/api/v1/doctors/{id}` | Trả về thông tin chi tiết của bác sĩ có mã `id` tương ứng |
| 3 | Thêm mới một bác sĩ                       | `POST` | `/api/v1/doctors` | Tạo mới một bác sĩ với dữ liệu gửi lên trong Request Body |
| 4 | Cập nhật thông tin sbác sĩ                | `PUT` | `/api/v1/doctors/{id}` | Cập nhật toàn bộ thông tin của bác sĩ có mã `id` tương ứng |
| 5 | Xóa bác sĩ khỏi hệ thống                  | `DELETE` | `/api/v1/doctors/{id}` | Xóa bác sĩ có mã `id` tương ứng khỏi hệ thống |