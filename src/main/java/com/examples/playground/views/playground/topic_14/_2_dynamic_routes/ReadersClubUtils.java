package com.examples.playground.views.playground.topic_14._2_dynamic_routes;

import com.vaadin.flow.router.RouteConfiguration;
import com.vaadin.flow.server.VaadinSession;

public class ReadersClubUtils {

  public static void configureRoutes() {

    // Application Scope Route: Visible to all
    // The route name is "programatic-public" because there is already the 'public' route
    // Two routes can't have the same name
    RouteConfiguration
         .forApplicationScope()
         .setRoute("programatic-public", PublicPage.class);

    // Session Scope Route: Available only for members
    if (isUserLoggedInTheSession()) {
      RouteConfiguration
           .forSessionScope()
           .setRoute("member-area", MemberPage.class);
    }
  }

  private static boolean isUserLoggedInTheSession() {

    return VaadinSession
                .getCurrent()
                .getAttribute("user") != null;
  }
}