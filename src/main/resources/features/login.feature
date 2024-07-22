Feature: Verify the login functionality

  Scenario: Verify the login functionality
    Given Launch the url
    When User enters valid credentials
    And Click on the login button
    Then User should be land on dashboard page

  Scenario: Verify the login functionality
    Given Launch the url
    When User enters invalid credentials
    And Click on the login button
    Then User should get validation message