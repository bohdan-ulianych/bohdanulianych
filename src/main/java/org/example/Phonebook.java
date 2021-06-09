package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
public class Phonebook {
    private HashMap<String, List<String>> list;

    public Phonebook(){
        this.list = new HashMap<>();
    }

    public void add(String name, String number){
        if(list.containsKey(name)){
            List<String> numbers = list.get(name);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println("Number " +number + " is added for " + name);
            } else {
                System.out.println("Number " +number + " is already exist for " + name);
            }
        } else {
            list.put(name, new ArrayList<>(Arrays.asList(number)));
            System.out.println("Number " +number + " is added for " + name);
        }
    }

    public List<String> get(String name){
        if(list.containsKey(name)){
            return list.get(name);
        } else {
            System.out.println(String.format("In phonebook don`t exist any marks about " + name));
            return new ArrayList<>();
        }
    }
}
