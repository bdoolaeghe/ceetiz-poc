package my;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CompanyTest {

    @Test
    public void should_compute_25_percent_of_taxes_for_auto_entreprise() {
        AutoEntreprise autoEntreprise = new AutoEntreprise("De-120", new Siret("1234"));
        Amount taxes = autoEntreprise.computeTaxes(Amount.of(100000));
        assertThat(taxes, is(Amount.of(25000)));
    }

    @Test
    public void should_compute_33_percent_of_taxes_for_SAS() {
        SAS sas = new SAS("sisson sec", new Siret("1234"), sampleAdress());
        Amount taxes = sas.computeTaxes(Amount.of(100000));
        assertThat(taxes, is(Amount.of(33000)));
    }

    private Adress sampleAdress() {
        return Adress.builder()
                .number("1 bis")
                .street("rue tabagga")
                .postalCode("75016")
                .city("paris")
                .build();
    }


}