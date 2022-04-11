package com.mond.gofdesignpattern.builder;

public interface DetailTourPlanBuilder {

    DetailTourPlanBuilder day(int day);

    DetailTourPlanBuilder plan(String plan);

    DetailPlan getDetailPlan();
}
