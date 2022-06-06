Feature: As a user, I want to access the Chat and Calls module
  Scenario: There should be four sub-modules once the user click the Chat and Calls module
    Given User is on the main page
    When User navigates to the "Chat and Calls" submodule
    Then User sees the Chat and Calls pop-up and verifies four sub-modules