@Run
Feature: create a new gathering

  Scenario: The admin logs in
    Given a new group is created
    When a new gathering is created
    Then the gathering exists