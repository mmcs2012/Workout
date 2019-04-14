package com.kirill.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The one", "5 hand\n10 cats"),
            new Workout("The two", "3 hand \n30 dogs"),
            new Workout("The three", "2 hand \n15 fishes")
    };

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
