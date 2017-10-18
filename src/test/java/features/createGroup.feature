@Run
Feature: create a group

  Scenario: The admin logs in
    Given logged in as admin
    When Admin creates a group
    Then the group exists