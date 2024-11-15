package com.examples.playground.views.playground.topic_16.nested_layouts;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.RouterLayout;

@ParentLayout(MainLayout.class)
public class TravelMenuLayout extends Div implements RouterLayout {

  public TravelMenuLayout() {

    setText("Travel Menu Content -> Parent Layout");
  }

}