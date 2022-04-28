package com.mond.gofdesignpattern.builder;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan jejuTrip() {
        return tourPlanBuilder.title("제주도 한바퀴 여행")
                .startDate(LocalDate.of(2022, 02, 22))
                .whereToStay("제주도")
                .nightsAndDays(3, 4)
                .addPlan(1, "명진전복")
                .addPlan(2, "고등어회")
                .addPlan(3, "카페 투어")
                .getPlan();
    }
}
