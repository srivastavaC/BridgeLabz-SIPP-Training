import java.util.ArrayList;
import java.util.List;

interface MealPlan {
    String getMealType();
    List<String> getMeals();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Non-Vegetarian";
    }

    public List<String> getMeals() {
        List<String> meals = new ArrayList<>();
        meals.add("Chicken Curry");
        meals.add("Kebab Roll");
        return meals;
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Chicken Lover";
    }

    public List<String> getMeals() {
        List<String> meals = new ArrayList<>();
        meals.add("Fish Fry");
        meals.add("Mutton Roast");
        return meals;
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "keto";
    }

    public List<String> getMeals() {
        List<String> meals = new ArrayList<>();
        meals.add("Grilled Chicken");
        meals.add("Biryani Bowl");
        return meals;
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein";
    }

    public List<String> getMeals() {
        List<String> meals = new ArrayList<>();
        meals.add("Boiled Eggs");
        meals.add("Protein Chicken");
        return meals;
    }
}

class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }
}

class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generatePlan(T plan) {
        return new Meal<>(plan);
    }

    public static <T extends MealPlan> void displayPlan(Meal<T> meal) {
        System.out.println("Meal Type: " + meal.getMealPlan().getMealType());
        for (String dish : meal.getMealPlan().getMeals()) {
            System.out.println("- " + dish);
        }
    }
}

public class PersonalizedMealSystem {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = MealPlanGenerator.generatePlan(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = MealPlanGenerator.generatePlan(new VeganMeal());
        Meal<KetoMeal> ketoMeal = MealPlanGenerator.generatePlan(new KetoMeal());
        Meal<HighProteinMeal> proteinMeal = MealPlanGenerator.generatePlan(new HighProteinMeal());

        MealPlanGenerator.displayPlan(NonVegMeal);
        MealPlanGenerator.displayPlan(ChickenMeal);
        MealPlanGenerator.displayPlan(ketoMeal);
        MealPlanGenerator.displayPlan(proteinMeal);
    }
}
