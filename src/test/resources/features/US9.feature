Feature: As a user, I want to access the correct modules

  Scenario Outline: Users should access the right page when they click on any module
    Given User is on the main page
    When User clicks on "<Module Names>"
    Then User should see "<Expected Titles>"

    Examples:
      | Module Names     | Expected Titles         |
      | Activity Stream  | Portal                  |
      | Tasks            | Site Map                |
      | Chat and Calls   | Chat and Calls          |
      | Workgroups       | Workgroups and projects |
      | Drive            | Site map                |
      | Calendar         | Site map                |
      | Contact Center   | Contact Center          |
      | Time and Reports | Absence Chart           |
      | Employees        | Company Structure       |
      | Services         | Meeting Rooms           |
      | Company          | Company                 |
