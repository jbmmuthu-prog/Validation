Feature: Validate
  Scenario: Validate L1
    Given Launch Chrome Browser
    When Enter credential
    Then Success

    Scenario: Invalid Login
      Given Launch Browser
      When Enter invalid credentials
      Then Got unseccessful error message


