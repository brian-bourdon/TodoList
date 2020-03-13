package com.company;

import java.time.LocalDateTime;
import java.util.UUID;

public class Item {
   private String content;
   private LocalDateTime time;
   private String state;
   private UUID id;

    public Item(String content) {
        this.content = content;
        this.state = "NEW";
        this.id = id.randomUUID();
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getState() {
        return state;
    }

    public Item markDone(){
        this.state = "DONE";
        return this;
    }
}
