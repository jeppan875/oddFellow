@Run
Feature: edit user

  Scenario: A user information is edited
    Given user is created
    And logged in as new user
    When user is edited
    Then new changes take effect