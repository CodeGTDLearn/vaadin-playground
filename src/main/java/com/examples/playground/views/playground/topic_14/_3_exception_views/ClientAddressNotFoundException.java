package com.examples.playground.views.playground.topic_14._3_exception_views;

public class ClientAddressNotFoundException extends RuntimeException {
  
  public ClientAddressNotFoundException(String message) {

    super(message);
  }
}