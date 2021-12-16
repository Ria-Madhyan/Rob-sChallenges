package com.company;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> toDoList = new ArrayList<>();

    //method to add item
    public void addItem(String item){
        toDoList.add(item);
        System.out.println(toDoList);
    }

    //method to remove item
    public void removeItem(int index){
        toDoList.remove(index);
        System.out.println("Item removed from index" + index);
    }

    //method to modify item
    public void modifyItem(int index, String item){
        toDoList.set(index, item);
        System.out.println(item + " updated at index " + index);
    }

    //print in each line
    public void printItems(){
        for(int i = 0; i < toDoList.size(); i++) {
            System.out.println("The item at index " + i + " is " + toDoList.get(i));
        }
    }




}
