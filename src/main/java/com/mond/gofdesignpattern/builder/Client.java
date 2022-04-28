package com.mond.gofdesignpattern.builder;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {
        DefaultTourPlanBuilder builder = new DefaultTourPlanBuilder();
        TourPlan plan = builder.title("제주도 한바퀴 여행")
                .startDate(LocalDate.of(2022, 02, 22))
                .whereToStay("제주도")
                .nightsAndDays(3, 4)
                .addPlan(1, "명진전복")
                .addPlan(2, "고등어회")
                .addPlan(3, "카페 투어")
                .getPlan();

        // Builder를 통해서 만드는게 아니라 Director를 사용하는 방법
        TourDirector tourDirector = new TourDirector(new DefaultTourPlanBuilder());
        TourPlan jejuTrip = tourDirector.jejuTrip();

//        Stream.Builder<String> stringBuilder = Stream.builder();
        Stream<String> names = Stream.<String>builder().add("jeju").add("trip").build();
        names.forEach(System.out::println);

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.naver.com")
                .path("/test")
                .build().encode();
        System.out.println(uriComponents);
    }
}
