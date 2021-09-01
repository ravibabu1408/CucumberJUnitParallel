#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: testLogin to Rediffmail
    Background: 
      Given Open "chrome" browser

  @tag1
  Scenario:Login to rediffmail with valid username and password111
    Given Launch rediffmail login
    When I enter username as "ravibabu408@rediffmail.com"
    And I enter password as "kanapa"
    And I Click on login button
    Then I loggged into rediffmail successfully
   
  @tag1
  Scenario:Login to rediffmail with invalid username and password131
    Given Launch rediffmail login
    When I enter username as "ravibabu408@rediffmail.com"
    And I enter password as "kanapa"
    And I Click on login button
    Then I loggged into rediffmail successfully
   

    
  @tag1
  Scenario:Login to rediffmail with invalid username and password121
    Given Launch rediffmail login
    When I enter username as "ravibabu408@rediffmail.com"
    And I enter password as "kanapa"
    And I Click on login button
    Then I loggged into rediffmail successfully
   