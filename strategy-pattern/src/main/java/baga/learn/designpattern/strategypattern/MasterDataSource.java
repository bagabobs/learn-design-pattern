package baga.learn.designpattern.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class MasterDataSource implements DataSource {
    @Override
    public List<Schedule> retrieve() {
        List<Schedule> schedules = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            Schedule masterSchedule = Schedule.builder()
                    .scheduleName("Master Schedule: " + (i + 1))
                    .build();
            schedules.add(masterSchedule);
        }
        return schedules;
    }
}
