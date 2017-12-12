package com.example;

public class ItemHelper {
    
    public Item doSomethingWithItem() {
        Item item = createItem();
        
        item.process();
        
        return item;
    }
    
    private Item createItem() {
        return new Item(Item.Type.real);
    }
}
