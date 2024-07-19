Feature: Demo of flight booking seperate

  # Background:
  #  Given user should navigate to the application
  Scenario Outline: Title of your scenario outline
    And user clicks on the round trip
    And user enter the "<from>" info
    And user should enter the "<to>" info
    When user clicks on the search flight
    Then user should get the list of flight info

    @reg
    Examples: 
      | from | to  |
      | dxb  | cok |
      | dxb  | trv |
