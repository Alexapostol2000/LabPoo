package task4;

import java.io.*;
import java.util.*;

import task4.Book;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Morometii", "Marin Preda", 1955);
        System.out.println(b1);

        Book b2 = new Book("Levantul", "Mircea Cărtărescu", 1990);
        System.out.println(b2);
        System.out.println(b1.toString());
    }
}