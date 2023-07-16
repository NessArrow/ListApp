package com.proizvodstvo.listapp;

import java.util.Random;

public class ListItem {

    private int avatarId;
    private String name;

    private long randomNumber;

    private ListItem(int avatarId, String name, long randomNumber) {
        this.avatarId = avatarId;
        this.name = name;
        this.randomNumber = randomNumber;
    }

    public static final String[] names = new String[] {
            "Victor",
            "Sergey",
            "Robbert",
            "Valeriy",
            "Snake",
            "Billy",
            "Piter",
            "Erich",
            "Pod"
    };
    public static int[] ids = new int[] {
            R.drawable.blackbird,
            R.drawable.cow,
            R.drawable.deer,
            R.drawable.dinosaur,
            R.drawable.jacutinga,
            R.drawable.jaguar,
            R.drawable.macaw,
            R.drawable.pelican,
            R.drawable.shark
    };
    public static ListItem generateListItem() {
        int id = ids[new Random().nextInt(9)];
        String name = names[new Random().nextInt(9)];
        long number = new Random().nextLong();

        return new ListItem(id, name, number);
    }

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(long randomNumber) {
        this.randomNumber = randomNumber;
    }
}
