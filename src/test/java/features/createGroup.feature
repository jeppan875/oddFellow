@Run
Feature: create a group

  Scenario: A new group is created
    Given logged in as admin
    When admin creates a group
    Then the group exists