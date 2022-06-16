package p.transport;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@Getter
@SuperBuilder
@Setter
public abstract class Air extends Transport {
    private double wingspan;
    private double minimumRunwayLengthForTakeoff;
}
