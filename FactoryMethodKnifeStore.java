// Example of factory method
// For simplicity, all the code are placed in this .java file
public abstract class KnifeStore {
    public Knife orderKnife(string knifeType) {
        Knife knife;

        // create a knife is a method in the class
        knife = createKnife(knifeType);

        // prepare the knife
        knife.shapen();
        knife.polish();
        knife.package();

        return knife;
    }

    abstract Knife creatKnife(String knifeType);
}

public BudgetKnifeStore extends KnifeStore {
    // up to the subclass of KnifeStore to define this method
    Knife createKnife(String knifeType) {
        if (knifeType.equals("steak")) {
            return new BudgetSteakKnife();
        } else if (knifeType.equals("chefs")) {
            return new BudgetChefsKnife();
        } // .... more types
        else return null;
    }
}

