package my;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
public abstract class Company {

    @NonNull
    private String name;
    @NonNull
    private Siret siret;
}
