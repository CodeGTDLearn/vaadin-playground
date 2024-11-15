package com.examples.playground.views.playground.topic_15.query_parameters;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.QueryParameters;
import com.vaadin.flow.router.Route;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Topic 5: Query Parameters
// Example 5: Filtering with Query Parameters
@Route("student-search")
public class StudentSearchView extends Div {

  public StudentSearchView() {

    var button = new Button("Search for Active Students");

    button
         .addClickListener(e -> {

           Map<String, List<String>> searchParams = new HashMap<>();

           searchParams.put("status", Arrays.asList("active"));

           var queryParams = new QueryParameters(searchParams);

           button
                .getUI()
                .ifPresent(ui ->
                                ui.navigate(
                                     "filtered-students",
                                     queryParams
                                )
                );
         });

    add(button);
  }
}