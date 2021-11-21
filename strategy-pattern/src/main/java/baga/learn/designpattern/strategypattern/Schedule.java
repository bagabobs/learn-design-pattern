package baga.learn.designpattern.strategypattern;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class Schedule {
    private String scheduleName;
}
