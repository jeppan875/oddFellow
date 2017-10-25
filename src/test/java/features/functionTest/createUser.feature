@Run
Feature: create user

  Scenario: A new user is created
    Given is logged in as admin
    When a new user is created
    Then login as new user
    And delete new user