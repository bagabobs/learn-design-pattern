package baga.learn.designpattern.strategypattern;

public class ActualSchedule extends TrainSchedule {
    public ActualSchedule() {
        this.dataSource = new ActualDataSource();
    }
}
