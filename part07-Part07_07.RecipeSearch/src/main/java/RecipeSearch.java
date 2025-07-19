
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.valueOf(fileScanner.nextLine());

                ArrayList<String> ingredients = new ArrayList<>();
                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, cookingTime, ingredients));

                ingredients.clear();
            }
        } catch(Exception e) {
            System.out.println("Reading the file " + file + "failed.");
        }
        System.out.println();

        printCommands();
        
        while (true) {
            System.out.println();

            System.out.print("Enter command: ");
            String option = scanner.nextLine().toLowerCase();

            if (option.equals("stop")) {
                break;
            }

            System.out.println();

            System.out.println("Recipes: ");
            switch (option) {
                case "list": 
                    list(recipes);
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String input = scanner.nextLine();
                    findByName(recipes, input);
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int maxCookingTime = scanner.nextInt();
                    findByCookingTime(recipes, maxCookingTime);
                    break;
                case "find ingredient":
                    System.out.println("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    findByIngredient(recipes, ingredient);
                    break;
            }
        }
    }

    public static void printCommands() {
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    public static void list(ArrayList<Recipe> recipes) {
        for (Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }

    public static void findByName(ArrayList<Recipe> recipes, String input) {
        for (Recipe recipe: recipes) {
            if (recipe.getName().toLowerCase().contains(input.toLowerCase())) {
                System.out.println(recipe);
            }
        }
    }

    public static void findByCookingTime(ArrayList<Recipe> recipes, int maxCookingTime) {
        for (Recipe recipe: recipes) {
            if (recipe.getCookingTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public static void findByIngredient(ArrayList<Recipe> recipes, String ingredient) {
        for (Recipe recipe: recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
