@FunctionalTests
Feature: Ecommerce Application

  @SmokeTesting @RegressionTesting
  Scenario: Successful Login
    Given Successful Login
   
  @RegressionTesting
  Scenario: UnSuccessful Login
    Given UnSuccessful Login
    
    @SmokeTesting 
  Scenario: Add Product to a Bag
    Given Add Product to a Bag
    
    
  Scenario: Add multiple Product to a Bag
    Given Add multiple Product to a Bag
    
    @SmokeTesting @RegressionTesting
 Scenario: Remove a Product from a Bag
    Given Remove a Product to a Bag
    
    @RegressionTesting
  Scenario: Remove all Product from a Bag
    Given Remove all Product from a Bag
    
    @SmokeTesting 
     Scenario: Increase product quantity
    Given Increase product quantity
  
      
     Scenario: Decrease product quantity
    Given Decrease product quantity
   
   @SmokeTesting @E2ETesting
   Scenario Outline: Make Payment
   Given Making Payment using "<PaymentMode>"
   
   Examples:
   |PaymentMode|
   |Credit Card|
   |Debit Card|
   |NetBanking|
   |Paytm|
   |Cash|
   |UPI|
   |MPesa|
   
    @RegressionTesting
  Scenario: Payment Decline
    Given Payment Decline
    

  
