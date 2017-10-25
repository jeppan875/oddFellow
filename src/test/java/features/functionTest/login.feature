@Run
Feature: Login

      Scenario: The admin logs in
        Given is not logged in
        When Admin logs in
        Then the user should be logged in