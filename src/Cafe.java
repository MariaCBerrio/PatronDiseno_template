class Coffee extends MaquinaBebidas {
    // Implementación concreta del método brew() para hacer café
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    // Implementación concreta del método addCondiments() para añadir condimentos al café
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    // Método hook que sobrescribe el comportamiento predeterminado para personalizar la receta de café
    boolean customerWantsCondiments() {
        // El cliente puede elegir si quiere condimentos o no
        return false;
    }
}