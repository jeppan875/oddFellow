@Run
Feature: Signup for a gathering

  Scenario: A user signs up for a gathering
    Given logged in as an administrator
    And administrator creates a new group
    And a new gathering is added to the group
    And admin creates a new user
    And admin adds user to new group
    And admin logs out and logs in as new user
    When user signup for the gathering
    Then the user should be registred for the gathering
    And delete new user and group