package my;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class Adress {

    @NonNull
    private String number;
    @NonNull
    private String street;
    @NonNull
    private String postalCode;
    @NonNull
    private String city;

}
