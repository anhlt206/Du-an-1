class Student {
    private String name;
    private String id;
    private String address;
    private String phone;
    private String email;
    private String password;

    Student(String name, String id, String address, String phone, String email, String password) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    // Tôi ở nhánh Teacher. Tôi cũng muốn test conflict.
}
