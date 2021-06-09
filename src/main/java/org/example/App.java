package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        /////////////////////////////task1
        List<String> mas = Arrays.asList(
                "fox", "cat", "woolf", "cat", "chicken",
                "bird", "bear", "fox", "fox", "fox",
                "sheep", "woolf", "woolf", "woolf", "woolf",
                "kitten", "cat", "Chupakabra", "cat", "cat"
        );

        Set<String> unique = new HashSet<String>(mas);

        System.out.println("Start array: ");
        System.out.println(mas.toString());
        System.out.println("Unique words");
        System.out.println(unique.toString());
        System.out.println("Number of occurrence words: ");
        for (String key : unique) {
            System.out.print(key + ": " + Collections.frequency(mas, key)+ ", ");
        }
        System.out.println("");
        ////////////////task2
        System.out.println("Add a new phonebook...");
        Phonebook phonebook = new Phonebook();
        System.out.println("");
        System.out.println("Add marks into phonebook...");
        phonebook.add("Frodo", "06669885698");
        phonebook.add("Harry Potter", "02225845");
        phonebook.add("Sponge Bob", "2499");
        phonebook.add("Mikel Jordan", "16516131651");
        phonebook.add("Lionel Messi", "541651");
        System.out.println("");

        System.out.println("Find data...");
        System.out.println("Frodo");
        System.out.println(phonebook.get("Frodo"));
        System.out.println("Sponge Bob");
        System.out.println(phonebook.get("Sponge Bob"));
        System.out.println("Lionel Messi");
        System.out.println(phonebook.get("Lionel Messi"));
        System.out.println("");

        System.out.println("If we don`t have coincidences...");
        System.out.println("Thor");
        System.out.println(phonebook.get("Thor"));
        System.out.println("-");

        System.out.println("Try to add existing number...");
        phonebook.add("Frodo", "22334465454");
        System.out.println("Frodo");
        System.out.println(phonebook.get("Frodo"));

    }
    }


