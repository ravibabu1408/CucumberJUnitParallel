#Author: your.email@your.domain.com

@tag
Feature: Login to Rediffmail
    Background: 
      Given Open "chrome" browser

  @tag1
  Scenario:Login to rediffmail with valid username and password11
    Given Launch rediffmail login
    When I enter username as "ravibabu408@rediffmail.com"
    And I enter password as "kanapa"
    And I Click on login button
    Then I loggged into rediffmail successfully
   
  @tag1
  Scenario:Login to rediffmail with invalid username and password133
    Given Launch rediffmail login
    When I enter username as "ravibabu408@rediffmail.com"
    And I enter password as "kanapa"
    And I Click on login button
    Then I loggged into rediffmail successfully
   

    
  @tag1
  Scenario:Login to rediffmail with invalid username and password124
    Given Launch rediffmail login
    When I enter username as "ravibabu408@rediffmail.com"
    And I enter password as "kanapa"
    And I Click on login button
    Then I loggged into rediffmail successfully
   

