Feature: Login - into - warehouse

  @T-1
  Scenario:Login - into - warehouse with wrong configuration

    Given User opens warehouse application
    When User input credentials as wrong account configuration user to login
    Then Error validation message with text: "Unknown email address. Check again or try your username." should be displayed

  @T-2
  Scenario:Login - into - warehouse
    Given User opens warehouse application
    When User input credentials as EXISTING user to login
    Then Welcome message with text: "Hello karpiuk.olga22 (not karpiuk.olga22? Log out)" should be visible

