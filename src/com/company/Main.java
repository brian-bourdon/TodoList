package com.company;

public class Main {

    public static void main(String[] args) {
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        TodoList list = new TodoList();
        list.addItem(item1);
        list.addItem(item2);
        //list.deleteItem(item1);
        item2.markDone();
        System.out.println(list);
    }
}
