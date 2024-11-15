package com.examples.playground.views.playground.topic_17;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.Route;

import static com.examples.playground.views.playground.topic_17.Topic17_Routes.AFTER_NAV_ROUTE;
import static com.examples.playground.views.playground.topic_17.Topic17_Routes.LOGIN_USER_VIEW;


@Route(AFTER_NAV_ROUTE)
public class AfterNavigationEvent_View extends VerticalLayout implements AfterNavigationObserver {

  public AfterNavigationEvent_View() {

    add(
         createHeader(),
         createContentArea()
    );
  }

  @Override
  public void afterNavigation(AfterNavigationEvent event) {

    final Text text = new Text("Welcome to our private view! You View were COMPLETELY RENDERED");
    var dialog = new Dialog(text);
    dialog.setModal(true);
    dialog.open();

  }
  private H1 createHeader() {

    H1 header = new H1("This is My Header -> After Navigation Event View");
    return header;
  }
  private VerticalLayout createContentArea() {

    VerticalLayout contentArea = new VerticalLayout();

    contentArea.add(
         createGreeting(),
         createLogoutButton()
    );

    return contentArea;
  }
  private Span createGreeting() {

    var greeting = new Span("It is pleasure to have you, in our private View.");

    greeting.getStyle()
            .set("color", "purple");

    return greeting;
  }
  private Button createLogoutButton() {

    Button logoutButton = new Button("Logout");

    logoutButton
         .addClickListener(
              event -> UI.getCurrent()
                         .navigate(LOGIN_USER_VIEW)
         );

    return logoutButton;
  }

}