package com.company;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.time.temporal.ChronoUnit;

public class TodoList {
    private LinkedList<Item> list;

    public TodoList() {
        this.list = new LinkedList<Item>();
    }

    public TodoList addItem(Item item){
        this.list.addFirst(item);
        return this;
    }

    public TodoList deleteItem(Item item){
        this.list.remove(item);
        return this;
    }

    @Override
    public String toString() {
        String res = "";
        LocalDateTime now = LocalDateTime.now();
        for(int i = 0 ; i < list.size(); i++) {
            long days = now.until(list.get(i).getTime(), ChronoUnit.DAYS);
            LocalDateTime diffD = now.plusDays(days);

            res += "[" + diffD + "] " + list.get(i).getContent();
        }
        return res;
    }
}
