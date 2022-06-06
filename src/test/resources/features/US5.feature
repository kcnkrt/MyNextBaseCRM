Feature: As a user, I should be able to send simple text messages using the message tab.
  Scenario: User should be able to write message successfully
    Given User is on the main page
    When User navigates to the "Message" tab
    Then Message body should open up
    And User should write a message and post it

    Scenario: User should see error message when message has no content
      Given User is on the main page
      When User navigates to the "Message" tab
      Then Message body should open up
      And User leave the message body blank and post it
      Then User should see "The message title is not specified" error message

