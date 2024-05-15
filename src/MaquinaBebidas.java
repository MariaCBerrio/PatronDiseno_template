abstract class Recipe {
    // Método template que define el esqueleto de preparación de la receta
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    // Métodos abstractos que deben ser implementados por las subclases
    abstract void brew();
    abstract void addCondiments();

    // Métodos comunes que pueden ser utilizados por todas las subclases
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Método hook que puede ser sobreescrito por las subclases para personalizar el comportamiento
    boolean customerWantsCondiments() {
        return true;
    }
}

