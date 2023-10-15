package com.company;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String genderCode;
        if (gender == 'M') {
            genderCode = "(m)";
        } else if (gender == 'F') {
            genderCode = "(f)";
        } else {
            genderCode = "(u)";
        }
        return name + " " + genderCode + " at " + email;
    }
}
