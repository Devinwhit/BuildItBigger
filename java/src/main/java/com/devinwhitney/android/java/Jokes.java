package com.devinwhitney.android.java;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {
    public String getJoke() {
        ArrayList<String> jokeList = new ArrayList<>();
        jokeList.add("test");
        jokeList.add("Another Test");
        jokeList.add("A third Test");
        Random random = new Random();
        return jokeList.get(random.nextInt(jokeList.size()));
    }
}
