Feature: As a user I should log out of the NextBaseCRM app
  Scenario: Verify users log out successfully
    Given User is on the main page
    When User clicks on the avatar button
    Then User clicks on the log out option
    And User navigates back to the login page
