package my;

public class AutoEntreprise extends Company implements Taxable {

    public AutoEntreprise(String name, Siret siret) {
        super(name, siret);
    }

    @Override
    public Amount computeTaxes(Amount turnOver) {
        return Amount.of(turnOver.getValue() * 0.25f);
    }
}
