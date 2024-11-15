package com.examples.playground.views.playground.topic_17;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;

import static com.examples.playground.views.playground.topic_17.Topic17_Routes.LOGGED_USER_VIEW;
import static com.examples.playground.views.playground.topic_17.Topic17_Routes.LOGIN_USER_VIEW;

@Route(LOGIN_USER_VIEW)
public class BeforeEnterEvent_LoginView extends VerticalLayout implements BeforeEnterObserver {

  final String USER_ADMIN = "admin", USER_PASSWORD = "password";
  private TextField userField;
  private PasswordField passwordField;
  private Button loginButton;

  public BeforeEnterEvent_LoginView() {

    H1 title = new H1("MyLoginView");
    setUpLayout();
    setUpViewComponents();

    add(
         title,
         userField,
         passwordField,
         loginButton
    );
  }

  @Override
  public void beforeEnter(BeforeEnterEvent event) {

    Notification.show(
         "This is executed 'BEFORE ENTER HERE!'(BEFORE RENDER THIS VIEW) in this RESPECTIVE VIEW.");
  }

  private void setUpLayout() {

    setSizeFull();
    setJustifyContentMode(JustifyContentMode.CENTER);
    setAlignItems(Alignment.CENTER);

  }

  private void setUpViewComponents() {

    userField = new TextField("User");
    passwordField = new PasswordField("Password");
    loginButton = new Button("Login");

    customLoginButton();
  }

  private void customLoginButton() {

    loginButton
         .addClickListener(event -> {
           var username = userField.getValue();
           var password = passwordField.getValue();

           if (username.equals(USER_ADMIN) &&
               password.equals(USER_PASSWORD)) {
             Notification.show("Login successful!");
             UI.getCurrent().navigate(LOGGED_USER_VIEW);}
           else Notification.show("Invalid username or password.");
         });
  }
}