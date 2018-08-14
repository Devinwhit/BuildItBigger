package com.devinwhitney.android.java;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {
    public String getJoke() {
        ArrayList<String> jokeList = new ArrayList<>();
        jokeList.add("Q. What does a cat have that no other animal has?\n" +
                "\n" +
                "A. Kittens.");
        jokeList.add("Why are frogs always so happy? They eat what ever bugs them");
        jokeList.add("I couldn't figure out why the baseball kept getting larger. Then it hit me.");
        jokeList.add("What happens to a frog's car when it breaks down?\n" +
                "It gets toad away.");
        jokeList.add("Q: What did the duck say when he bought lipstick?\n" +
                "A: \"Put it on my bill.\"");
        jokeList.add("Q: Can a kangaroo jump higher than the Empire State Building? \n" +
                "A: Of course. The Empire State Building can't jump.");
        Random random = new Random();
        return jokeList.get(random.nextInt(jokeList.size()));
    }
}
