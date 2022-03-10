Feature: trello
@api1
  Scenario: Create Board

    Given Send POST request for create "mart" board
    Then  Assert status code 200
    And Assert board name is "mart"


