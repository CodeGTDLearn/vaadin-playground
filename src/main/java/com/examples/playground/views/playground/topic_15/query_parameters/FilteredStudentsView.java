package com.examples.playground.views.playground.topic_15.query_parameters;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.html.Label;

import java.util.List;
import java.util.Map;

// Topic 5: Query Parameters
// Example 5: Filtering with Query Parameters (Correção Aplicada)
@Route("filtered-students")
public class FilteredStudentsView extends Div implements BeforeEnterObserver {

    @Override
    public void beforeEnter(BeforeEnterEvent event) {

        Map<String, List<String>> queryParams = event.getLocation().getQueryParameters().getParameters();

        String statusFilter = queryParams.getOrDefault("status", List.of("none")).get(0);

        add(new Label("Filtered by Status: " + statusFilter));
    }
}