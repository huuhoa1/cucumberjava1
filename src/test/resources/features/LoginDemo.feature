Feature: Test Login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on main login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the main home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
      | Ele      |    12345 |
