Feature: Login Logout Feature
  
 
  Scenario Outline: Valid LoginTest
    Given User is on login page2
    When User enters "<username>" and "<password>" in app2"
    And CLick on Login/Enter2
    Then User will be logged into application2
    And able to seelanding page2

 Examples:
 |username | password |
 | user1   | pwd1  |
 |user2 	| pwd2 |
 | user3   | pwd3 |
 