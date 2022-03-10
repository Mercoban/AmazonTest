Feature:

  @api3
  Scenario: Create List

    Given  POST request for create list
    Then Verify response


    @api4

    Scenario: UpdateList
      Given PUT request for update list
      Then Verify update response

