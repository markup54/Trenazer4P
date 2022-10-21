package com.example.trenazerfragmenty;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts ={
            new Workout("Bieganie z interwałami", "minuta biegu z maksymalną prędkością, 5 minut biegu truchtem"),
            new Workout("trening siłowy","klata, biceps, barki"),
            new Workout("spacer z kijkami", "relaksacyjny spacer z osobą towarzyszącą, rozmowa")
    };

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return  name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
