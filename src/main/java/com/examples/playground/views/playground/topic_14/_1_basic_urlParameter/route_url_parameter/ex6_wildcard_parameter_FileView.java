package com.examples.playground.views.playground.topic_14._1_basic_urlParameter.route_url_parameter;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.WildcardParameter;

@Route("files")
public class ex6_wildcard_parameter_FileView extends Div implements HasUrlParameter<String> {
  @Override
  public void setParameter(BeforeEvent event,
                           @WildcardParameter String filePath) {

    if (filePath.isEmpty()) {
      setText("No file path specified.");
    } else {
      setText("File Path: " + filePath);
    }
  }
}