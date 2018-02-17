Feature: FreeCRM Deals  

##background will run before each and every scenario which is present in that feature file
##code that is related to a feature as a whole should come under Background
##code which is associated with a scenario should go under hooks
Background: Prequisites for FreeCRM Deals Page
Given I launch browser
And cleared caches
When I entered Credentials
|username| password|
|userA   | pwd     |
And Clicked login
Then Home Page gets displayed

@CreateDeal
   Scenario: Create a Deal
    Given I am on Deals Page
    When I fill in all details
    And click Sve
    Then A new deal gets Created
  
  @SearchDeal  
  Scenario Outline: Search for Deals
    Given I am on search deals page
    When I enter "<dealName>"
    And click Search
    Then I get deal details
    
    Examples:
    |dealName|
    |deal1|
    |deal2|
    |deal3|
    

