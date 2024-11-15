package com.examples.playground.views.playground.topic_16.simple_layouts;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.router.RouterLayout;

public class MainLayout extends Div implements RouterLayout {
  public MainLayout() {

    Header header = new Header();
    header.setText("Header -> Parent Layout (simple layout)");

    add(header);
  }
}