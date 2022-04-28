package com.mond.gofdesignpattern.builder;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate startDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    TourPlan getPlan(); // TourPlan을 반환하기 전까지 Method Chaning이 일어남

}
