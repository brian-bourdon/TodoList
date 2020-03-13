package com.company.test;

import com.company.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    Item item1 = new Item("test1");
    @Test
    void item() {
        assertEquals(item1.getState(), "NEW");
    }
    @Test
    void markDone() {
        assertEquals(item1.getState(), "DONE");
    }
    @Test
    void getContent() {
        assertEquals(item1.getContent(), "test1");
    }

}