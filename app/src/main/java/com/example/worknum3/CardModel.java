package com.example.worknum3;

public class CardModel {
     int imageResource;
    String text;

    public CardModel(int imageResource, String text) {
        this.imageResource = imageResource;
        this.text = text;
    }


    public int getImageResource() {
        return imageResource;
    }

    public String getText() {
        return text;
    }
}
