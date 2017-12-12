package com.example;

/**
 * NOTE: the item is final!
 */
public final class Item {

    public static enum Type {
        real, mocked;
    }
    
    private Type type;
    
    public Item(Type type) {
        this.type = type;
    }
    
    public Type getType() {
        return type;
    }
    
    public void process() {
        // some stuff requiring external components.
    }
    
    @Override
    public String toString() {
        return "The " + type + " item!";
    }
}