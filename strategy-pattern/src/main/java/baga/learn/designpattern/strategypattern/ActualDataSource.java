package baga.learn.designpattern.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class ActualDataSource implements DataSource {
    @Override
    public List<Schedule> retrieve() {
        List<Schedule> schedules = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            Schedule actualSchedule = Schedule.builder()
                    .scheduleName("Actual Schedule: " + (i + 1))
                    .build();
            schedules.add(actualSchedule);
        }
        return schedules;
    }
}
