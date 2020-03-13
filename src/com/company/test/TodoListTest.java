package com.company.test;

import com.company.Item;
import com.company.TodoList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TodoListTest {
    Item item1 = new Item("test1");
    Item item2 = new Item("test2");
    TodoList list = new TodoList();

    @org.junit.jupiter.api.Test
    void addItem() {
        TodoList list2 = list.addItem(item1);
        assertEquals(list2.toString(), "[0d] test1");
    }

    @org.junit.jupiter.api.Test
    void deleteItem() {
        list.deleteItem(item1);
        assertEquals(list.toString(), "");
    }
}