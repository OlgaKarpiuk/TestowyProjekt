Feature: Login - into - warehouse

  @T-1
  Scenario:Login - into - warehouse
    Given User opens warehouse application
    When User input credentials to login
    Then Error validation message with text: "Unknown email address. Check again or try your username." should be displayed
