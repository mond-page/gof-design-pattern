package com.mond.gofdesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{
    private List<Component> components;

    public Bag() {
        components = new ArrayList<>();
    }

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
