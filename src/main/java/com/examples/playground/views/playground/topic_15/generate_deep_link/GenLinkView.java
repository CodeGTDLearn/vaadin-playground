package com.examples.playground.views.playground.topic_15.generate_deep_link;

import com.examples.playground.views.playground.topic_15.navigation_parameters.CourseView;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteConfiguration;

// Topic 3: Creating URLs
// Example 3: Generate and Display a Deep Link
@Route("generate-link")
public class GenLinkView extends Div {

  public GenLinkView() {

    var genLinkButton = new Button("Create Deep Link");
    var linkLabel = new Label();

    genLinkButton
         .addClickListener(e -> {
           var courseUrl =
                RouteConfiguration
                     .forSessionScope()
                     .getUrl(
                          CourseView.class,
                          "science"
                     );

           linkLabel.setText("Deep Link: " + courseUrl);

         });

    add(genLinkButton, linkLabel);
  }
}