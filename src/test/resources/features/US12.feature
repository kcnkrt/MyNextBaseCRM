Feature: As a user, I should be able to Make Appreciation using the Appreciation tab

  Scenario: Users should be able to write messages in and send appreciations by clicking
  the SEND button
    Given User is on the main page
    When User clicks on "More" tab
    And User clicks on "Appreciation" tab
    Then User writes message in appreciation body
    And User clicks on the send button

  Scenario: Users attempt to make appreciation without a message, there should be
  a working message “The message title is not specified”
    Given User is on the main page
    When User clicks on "More" tab
    And User clicks on "Appreciation" tab
    Then User leaves message body blank
    And User clicks on the send button
    Then User verifies the error message