package com.company;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
        Author author2 = new Author("Sue Grant", "suGrant@somewhere.com", 'F');

        System.out.println(author1.toString());
        System.out.println(author2.toString());
    }
}