package code.kliangh.creational.immutableobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Product */
public final class Dish {
    private final String dishName;

    private final DishType dishType;

    //Warm notes from chef, let customer know how to enjoy the dish.
    private final List<String> notes;

    public Dish(String dishName, DishType dishType, List<String> notes) {
        this.dishName = dishName;
        this.dishType = dishType;

        //Create a new list object.
        this.notes = new ArrayList<>(notes);
    }

    public String getDishName() {
        return dishName;
    }

    public DishType getDishType() {
        return dishType;
    }

    public List<String> getNotes() {
        /*
        Be advised!
        Other developer could modify the list by dish.getNotes().clear()
        if you return the reference of notes directly.
        */
        return Collections.unmodifiableList(this.notes);
    }
}
