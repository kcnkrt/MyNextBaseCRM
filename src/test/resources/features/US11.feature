Feature: As a user, I should be able to Make Announcements using the Announcements tab

  Scenario: Users should be able to write messages in and send announcements by clicking
  the SEND button
    Given User is on the main page
    When User clicks on "More" tab
    And User clicks on "Announcement" tab
    Then User writes message in announcement body
    And User clicks on the send button

  Scenario: Users attempt to make announcements without a message, there should be
  a working message “The message title is not specified”
    Given User is on the main page
    When User clicks on "More" tab
    And User clicks on "Announcement" tab
    Then User leaves message body blank
    And User clicks on the send button
    Then User verifies the error message