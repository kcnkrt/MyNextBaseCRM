Feature: As a user, I want to create a task with just task content from the TASK tab
  Scenario: User gets an error message when tries to create a task without title
    Given User is on the main page
    When User clicks on "Task" tab
    Then User leaves the title blank
    And User writes message in message body
    Then User clicks on the send button
    Then User should see the Task name not specified error message

