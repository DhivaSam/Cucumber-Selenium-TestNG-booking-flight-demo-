@Sanity
Feature: Demo of flight booking

  Background: 
    Given user should navigate to the application info
    And user clicks on the round trip icon

  Scenario: Search Flights for Trv
    And user enter the from info as "DXB"
    And user enter the to info  as "TRV"
    When user clicks on the search flight
    Then user should get the list of flight info

@smoke 
  Scenario: Search Flights for yyyy
    And user enter the from info as "DXB"
    And user enter the to info  as "COK"
    When user clicks on the search flight
    Then user should get not the list of flight info
