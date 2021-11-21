package baga.learn.designpattern.strategypattern;

import java.util.List;

public abstract class TrainSchedule {
    protected DataSource dataSource;

    List<Schedule> retrieveDatas() {
        return dataSource.retrieve();
    }
}
