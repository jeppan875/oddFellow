@Run
Feature: create user

  Scenario: The admin logs in
    Given is logged in as admin
    When a new user is created
    Then login as new user