package baga.learn.designpattern.strategypattern;

public class Main {
    public static void main(String[] args) {
        printSchedules(new MasterSchedule());

        printSchedules(new ActualSchedule());

        printSchedules(new TodaySchedule());
    }

    public static void printSchedules(TrainSchedule trainSchedule) {
        trainSchedule.retrieveDatas().forEach(System.out::println);
    }
}
