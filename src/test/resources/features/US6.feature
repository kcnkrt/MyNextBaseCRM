Feature: As a user, I want to see all the options under the MORE tab in the
  homepage.
  Scenario: Four options should be displayed under the MORE tab
    Given User is on the main page
    When User navigates to the "More" tab
    Then User should see four options displayed in the dropdown
