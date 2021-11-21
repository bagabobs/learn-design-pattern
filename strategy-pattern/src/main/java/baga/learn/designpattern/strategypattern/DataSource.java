package baga.learn.designpattern.strategypattern;

import java.util.List;

public interface DataSource {
    List<Schedule> retrieve();
}
