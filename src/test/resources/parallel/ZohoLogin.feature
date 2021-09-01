#Author: your.email@your.domain.com



Feature: Login to Zoho site
    Background: 
      Given Open "chrome" browser

  
   
   
    @tag1 @login
  Scenario: Login to Zoho with valid email and password12
    Given I launch the zoho "https://www.zoho.com/"
    And I clicked on signin link on  homepage
    When I enter email as "robraj111@gmail.com"
    And I click on Nex button
    And In enter password as "london123$"
    And I click on Nex button
    Then Landing page should be displayed.
    
   

    
  @tag1
  Scenario:Login to rediffmail with invalid username and password12
    Given Launch rediffmail login

   
    
  @tag1
  Scenario:Login to rediffmail with invalid username and password12
    Given Launch rediffmail login
    
    
    
  @tag1
  Scenario:Login to rediffmail with invalid username and password12
    Given Launch rediffmail login
    
    
    
  @tag1
  Scenario:Login to rediffmail with invalid username and password12
    Given Launch rediffmail login
    
    
    
  @tag1
  Scenario:Login to rediffmail with invalid username and password12
    Given Launch rediffmail login
    
    @tag1
  Scenario:Login to rediffmail with valid username and password11
    Given Launch rediffmail login

   
  @tag1
  Scenario:Login to rediffmail with invalid username and password13
    Given Launch rediffmail login
    
   

    
  @tag1
  Scenario:Login to rediffmail with invalid username and password12
    Given Launch rediffmail login
 
   
    