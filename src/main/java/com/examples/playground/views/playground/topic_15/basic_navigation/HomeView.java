package com.examples.playground.views.playground.topic_15.basic_navigation;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

// Topic 1: Introduction
// Example 1: Basic Navigation with Links
@Route("topic-15-home")
public class HomeView extends Div {

    public HomeView() {

        Div navigationBar = new Div();

        navigationBar.add(
            new RouterLink("Dashboard", DashboardView.class),
            new RouterLink("Profile", ProfileView.class)
        );

        add(navigationBar);
    }
}