package com.mond.gofdesignpattern.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BuilderNotUseExample {
    public static void main(String[] args) {
        // builder 사용하지 않는 경우
//        TourPlan tourPlan = new TourPlan();
//        tourPlan.setTitle("제주도 한바퀴 여행");
//        tourPlan.setStartDate(LocalDate.of(2022, 02, 22));
//        tourPlan.setWhereToStay("제주도");
//        tourPlan.setNights(3);
//        tourPlan.setDays(4);
//
//        List<DetailPlan> detailPlanList = new ArrayList<>();
//        detailPlanList.add(new DetailPlan(1, "명진전복"));
//        detailPlanList.add(new DetailPlan(2, "고등어회"));
//        detailPlanList.add(new DetailPlan(3, "카페투어"));
//
//        tourPlan.setPlans(detailPlanList);
    }
}
