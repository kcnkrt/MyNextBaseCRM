Feature: As a user, I should be able to log in to the NextBaseCRM

  Scenario: Verify login page title
    Given User is on the login page
    When User should verify the title is "Authorization"
    Then User enters valid credentials
    And User checks the checkbox label "Remember me on this computer"
    And User clicks on the log in button

  Scenario Outline: Verify login page title
    Given User is on the login page
    Then User enters "<invalid credentials>"
    And User clicks on the log in button
    And User should see the error message
    Examples:
      | invalid credentials |
      | invalidUsername     |
      | asdasd              |
      | wrong               |
