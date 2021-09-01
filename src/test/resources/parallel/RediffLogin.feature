#Author: your.email@your.domain.com

@tag
Feature: RediffLogin Test
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
  Scenario:Login to rediffmail with invalid username and password1331
    Given Launch rediffmail login
    When I enter username as "ravibabu408@rediffmail.com"
    And I enter password as "kanapa"
    And I Click on login button
    Then I loggged into rediffmail successfully
   

    
  @tag1
  Scenario:Login to rediffmail with invalid username and password1241
    Given Launch rediffmail login
    When I enter username as "ravibabu408@rediffmail.com"
    And I enter password as "kanapa"
    And I Click on login button
    Then I loggged into rediffmail successfully
   

