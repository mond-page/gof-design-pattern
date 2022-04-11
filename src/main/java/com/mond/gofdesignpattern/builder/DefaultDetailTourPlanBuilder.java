package com.mond.gofdesignpattern.builder;

public class DefaultDetailTourPlanBuilder implements DetailTourPlanBuilder{

    private int day;

    private String plan;

    @Override
    public DetailTourPlanBuilder day(int day) {
        this.day = day;
        return this;
    }

    @Override
    public DetailTourPlanBuilder plan(String plan) {
        this.plan = plan;
        return this;
    }

    @Override
    public DetailPlan getDetailPlan() {
        return new DetailPlan(day, plan);
    }
}
