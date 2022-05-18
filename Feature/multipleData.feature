Feature: test login application

  @Tag1
  Scenario Outline: valid successful login
    Given an application
    When valid "<username>" and "<password>" are entered
    Then Home Screen should be get displayed

    Examples: 
      | username                | password  |
      | ajayronaldo23@gmail.com | Ajay@1999 |
      | ajayronaldo23@gmail.com | Ajay@1999 |
