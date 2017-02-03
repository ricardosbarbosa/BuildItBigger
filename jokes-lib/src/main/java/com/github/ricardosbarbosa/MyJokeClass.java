package com.github.ricardosbarbosa;

import java.util.Random;

public class MyJokeClass {

    private static String[] jokes = {
        "Q: Why did the blind blonde cross the road? \n A: She was following her seeing-eye chicken.",
        "Q: Why did the one-handed man cross the road? \n A: To get to the second hand shop.",
        "Q: Why did the monkey cross the road?\n" + "A: So he could get spanked.",
        "Q: Why did the turkey cross the road?\n" + "A: Because he wasn't a chicken.\n",
        "Q: Why did the fat turkey cross the road?\n" + "A: To get hit by my car.",
        "Why did George W. Bush cross the road?\n" + "To ask his dad how to run the presidency.",
        "Q: Why did the gum cross the road? \n" + "A: Beacause it was stuck to the chicken's foot.",
        "Q: Why did the woman cross the road?\n" + "A: I don't know, but where'd she get shoes and what is she doing out of the kitchen?"
    };

    public static String tellMeAJoke() {
        int idx = new Random().nextInt(jokes.length);
        String random = (jokes[idx]);
        return random;
    }
}
