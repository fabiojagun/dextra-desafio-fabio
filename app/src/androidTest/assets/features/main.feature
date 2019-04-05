Feature: Verify Elements on Main

  @main-feature
  Scenario: Verify Elements ID`s on Main
    Given I am on Main
    Then User Views Element Text View
    Then User Views Field Alcohol
    Then User Views Field Gasoline
    Then User Views Button Calculate
    Then User Views Text Result

  @main-feature
  Scenario: Verify Text For Elements
    Given I am on Main
    Then User Views Text Know
    Then User Views Text For Btn Calculate
    Then User Views Text For Text Result

  @main-feature
  Scenario: Verify Text For Empty Values For Calculate
    Given I am on Main
    When User Tap On Calculate
    Then User Views Message For Empty Fields

  @main-feature
  Scenario: Verify Text For Gasoline Empty
    Given I am on Main
    And User Write Field Alcohol
    When User Tap On Calculate
    Then User View Message For Empty Gasoline

  @main-feature
  Scenario: Verify Text For Alcohol Empty
    Given I am on Main
    And User Write Field Gasoline
    When User Tap On Calculate
    Then User View Message For Empty Alcohol

  @main-feature
  Scenario: Verify Calculus For Better Value Alcohol
    Given I am on Main
    And User Write Field Alcohol
    And User Write Field Gasoline
    When User Tap On Calculate
    Then User View Calculus Result Alcohol Better

  @main-feature
    Scenario: Verify Calculus For Better Value Gasoline
      Given I am on Main
      And User Write Field Alcohol
      And User Write Field Gasoline Higher
      When User Tap On Calculate
      Then User View Calculus Result Gasoline Better