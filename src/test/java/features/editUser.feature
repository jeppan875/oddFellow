@Run
Feature: edit user

  Scenario: The admin logs in
    Given user is created
    And logged in as new user
    When user is edited
    Then new changes take effect