Feature: As a user, I want to see all the options under the user profile.
  Scenario: Five options should be displayed under the user profile
    Given User is on the main page
    When User clicks on the avatar button
    Then User has access to 5 options under the avatar button