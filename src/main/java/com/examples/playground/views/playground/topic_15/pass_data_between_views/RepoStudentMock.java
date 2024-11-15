package com.examples.playground.views.playground.topic_15.pass_data_between_views;

public class RepoStudentMock {
  public static final String MOCK_NAME = "Mock Name";
  public static final int MOCK_ID = 999;

  public static Student getStudentById() {

    return new Student(MOCK_NAME, MOCK_ID);
  }

  public static String getMockName() {

    return MOCK_NAME;
  }

  public static int getMockId() {

    return MOCK_ID;
  }
}