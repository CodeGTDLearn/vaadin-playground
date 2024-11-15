package com.examples.playground.views.playground.topic_17;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeLeaveEvent;
import com.vaadin.flow.router.BeforeLeaveObserver;
import com.vaadin.flow.router.Route;

import static com.examples.playground.views.playground.topic_17.Topic17_Routes.*;


@Route(LOGGED_USER_VIEW)
public class BeforeLeaveEvent_View extends VerticalLayout implements BeforeLeaveObserver {

  public BeforeLeaveEvent_View() {

    add(createHeader(),
        createGreeting(),
        createLogoutButton(),
        createNextViewButton()
    );
  }

  @Override
  public void beforeLeave(BeforeLeaveEvent event) {

    confirmationDialogBox(event);
  }

  private static void confirmationDialogBox(BeforeLeaveEvent event) {

    BeforeLeaveEvent.ContinueNavigationAction navigate = event.postpone();

    var dialog = new Dialog();
    var cancelButton = new Button("Cancel", e -> dialog.close());
    var confirmButton = new Button(
         "Confirm",
         e -> {
           navigate.proceed();
           dialog.close();
           Notification.show("Logged out successfully!");
         }
    );

    var question = new Span("Are you sure you want to leave this page?");
    dialog.add(question, new HorizontalLayout(confirmButton, cancelButton));
    dialog.open();
  }

  private H1 createHeader() {

    H1 header = new H1("This is My Header -> Before Leave Event View");
    return header;
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
  private Button createNextViewButton() {

    var logoutButton = new Button("Go to the Next View");

    logoutButton
         .addClickListener(
              event -> UI.getCurrent()
                         .navigate(AFTER_NAV_ROUTE)
         );

    return logoutButton;
  }

}