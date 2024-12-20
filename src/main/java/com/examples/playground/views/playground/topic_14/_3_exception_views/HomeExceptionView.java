package com.examples.playground.views.playground.topic_14._3_exception_views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("home-exception-view")
public class HomeExceptionView extends VerticalLayout {

  public HomeExceptionView() {

    var AddressNotFoundButton = new Button("Trigger: Address Not Found Error");
    AddressNotFoundButton.addClickListener(e -> {
      throw new ClientAddressNotFoundException(
           "The requested address ID was not found in the database");
    });

    var GlobalErrorButton = new Button("Trigger: Generic Error");
    GlobalErrorButton.addClickListener(e -> {
      throw new RuntimeException("Generic system error occurred");
    });

    var ReadyToGoErrorButton = new Button(
         "Trigger: Ready to Go - route not Found");
    ReadyToGoErrorButton
         .addClickListener(
              e -> ReadyToGoErrorButton.getUI()
                                       .ifPresent(ui ->
                                        ui.navigate("inexistent-route")));

    add(new H2("Error Handling Demo"),
        AddressNotFoundButton,
        GlobalErrorButton,
        ReadyToGoErrorButton
    );
  }
}