Feature: As a user, I should be able to see 3 desktop options in the homepage

  Scenario Outline: There should be 3 options for the desktop version
    Given User is on the main page
    When User scrolls down to Desktop Client
    Then User should see the "<Desktop Clients>"
    Examples:
      | Desktop Clients |
      | Mac OS          |
      | Windows         |
      | Linux           |