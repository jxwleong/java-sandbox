// Factory object use case
public class KnifeStore {
    private KnifeStore factory;

    // KnifeFactory object is required to passed to 
    // this constructor
    public KnifeStore(KnifeFactory factory) {
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType) {
        Knife knife;

        // use this create method in the factory
        // instead of multiple if-else instantiation
        // in the client code
        knife = factory.createKnife(knifeType);

        // prepare the knife
        knife.shapen();
        knife.polish();
        knife.package();

        return knife
    }
}
