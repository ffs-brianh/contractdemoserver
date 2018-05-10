package com.example.contractdemoserver;

public class TestObject {

    private int id;
    private String[] cards;

    public TestObject(){}

    public TestObject(int id, String[] cards){
        setId(id);
        setCards(cards);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getCards() {
        return cards;
    }

    public void setCards(String[] cards) {
        this.cards = cards;
    }
}
