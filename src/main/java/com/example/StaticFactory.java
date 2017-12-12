package com.example;

public class StaticFactory {
    public static Item createItem() {
        return new Item(Item.Type.real);
    }
}
