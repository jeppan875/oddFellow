@Run
Feature: create a new gathering

  Scenario: A gathering is created
    Given a new group is created
    When a new gathering is created
    Then the gathering exists