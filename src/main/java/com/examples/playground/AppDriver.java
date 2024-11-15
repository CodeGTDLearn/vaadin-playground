package com.examples.playground;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Theme(value = "playground")
public class AppDriver implements AppShellConfigurator {

  public static void main(String[] args) {

    SpringApplication.run(AppDriver.class, args);
  }
}