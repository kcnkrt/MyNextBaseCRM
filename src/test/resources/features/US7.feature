
Feature: As a user, I want to vote for a poll with one answer.
  Scenario: Users can select one answer and click the “VOTE” button to vote for a poll.
    Given User is on the main page
    When User scrolls down to poll
    Then User selects an option
    And User votes