package baga.learn.designpattern.strategypattern;

public class TodaySchedule extends TrainSchedule {
    public TodaySchedule() {
        this.dataSource = new TodayDataSource();
    }
}
