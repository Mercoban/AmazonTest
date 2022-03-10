Feature:
@apiPojo
  Scenario: CreateBoardPojo
    Given Send POST request for create board "yeni" with pojo
    Then GET response with pojo
    And Assert response "yeni"