package baga.learn.designpattern.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class TodayDataSource implements DataSource {
    @Override
    public List<Schedule> retrieve() {
        List<Schedule> schedules = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            Schedule schedule = Schedule.builder()
                    .scheduleName("Today Schedule: " + (i + 1))
                    .build();
            schedules.add(schedule);
        }
        return schedules;
    }
}
