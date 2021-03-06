package com.example.demo_b9_lt_sqlite;

public class Author
{
    private int id;
    private String name;
    private String address;
    private String email;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Author() {
        this.id = 0;
        this.name = null;
        this.address = null;
        this.email = null;
    }

    public Author(int id) {
        this.id = id;
        this.name = null;
        this.address = null;
        this.email = null;

    }

    public Author(int id, String name, String address, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
