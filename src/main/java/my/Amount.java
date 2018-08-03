package my;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@AllArgsConstructor(staticName = "of")
@Getter
public class Amount {
    float value;
}
