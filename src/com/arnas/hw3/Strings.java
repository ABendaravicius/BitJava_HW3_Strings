package com.arnas.hw3;

public class Strings {
    public static void main(String[] args) {
        System.out.println("Sveiki, Jonai,\nkaip sekasi?");
        System.out.println("-----");
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        // Mažosios raidės
        System.out.println(lorem.toLowerCase());
        // Didžiosios raidės
        System.out.println(lorem.toUpperCase());
        // Raidžių 'o' pakeitimas raidėmis 'z'
        System.out.println(lorem.replace('o','z'));
        // Stringas pasibaigia žodžiu 'elit'
        System.out.println(lorem.endsWith("elit"));
    }
}