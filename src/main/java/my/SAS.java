package my;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class SAS extends Company implements Taxable {

    @NonNull
    protected Adress headOffice;

    public SAS(String name, Siret siret, Adress headOffice) {
        super(name, siret);
        this.headOffice = headOffice;
    }

    @Override
    public Amount computeTaxes(Amount turnOver) {
        return Amount.of(turnOver.getValue() * 0.33f);
    }
}
