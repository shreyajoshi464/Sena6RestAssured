Feature: Test success status of latest foreign exchange rates api

  Scenario: Check response code isd valid
    Given API foreign exchange
    When posted with future date information
    Then validate positive response code received
