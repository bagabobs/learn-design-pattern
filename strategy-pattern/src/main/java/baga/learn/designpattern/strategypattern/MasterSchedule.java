package baga.learn.designpattern.strategypattern;

public class MasterSchedule extends TrainSchedule {
    public MasterSchedule() {
        this.dataSource = new MasterDataSource();
    }
}
