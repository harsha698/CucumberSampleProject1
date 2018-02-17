Feature: Login Logout Feature
  
 
  Scenario: Valid LoginTest
    Given User is on login page
    When User enters "user1" and "password1"
    And CLick on Login/Enter
    Then User will be logged into the application1
    And able to seelanding page

  Scenario: Logout
  When User clicks on Logout
  Then User will be logged out
