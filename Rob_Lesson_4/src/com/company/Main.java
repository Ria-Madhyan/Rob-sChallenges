package com.company;

public class Main {


    public static void main(String[] args) {
	// write your code here
        ToDoList riaToDoList = new ToDoList();

        riaToDoList.addItem("Good Morning0");
        riaToDoList.addItem("Good Morning1");
        riaToDoList.addItem("Good Morning2");
        riaToDoList.addItem("Good Morning3");
        riaToDoList.addItem("Good Morning4");

        riaToDoList.removeItem(3);
        riaToDoList.modifyItem(3, "Good Evening");

        riaToDoList.printItems();












    }
}
