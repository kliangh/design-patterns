package code.kliangh.creational.builder;

import code.kliangh.creational.immutableobjects.Dish;
import code.kliangh.creational.immutableobjects.DishType;
import com.google.common.collect.ImmutableList;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* Director */
public class Chef {
    private String dishName;

    private DishType dishType;

    private List<String> notes;

    public Dish serveDish() {
        return new Dish(dishName, dishType, notes);
    }

    public Chef setDishName(String dishName) {
        this.dishName = dishName;
        return this;
    }

    public Chef setDishType(DishType dishType) {
        this.dishType = dishType;
        return this;
    }

    public Chef setNotes(List<String> notes) {
        this.notes = notes;
        return this;
    }
}
