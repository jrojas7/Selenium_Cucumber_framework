@login  @regression

Feature: Automation Practice - Login Page

  Background:
    Given I access the automation practice login page

  Scenario: Validate Successful Login
    When I enter an email address jcarlostest1@yahoo.es
    And I enter a password Control123
    And I click on the sign in button
    Then I should be presented with the successful login message


  Scenario: Validate Unsuccessful login
    When I enter an email address jcarlostest1@yahoo.es
    And I enter a password password456
    And I click on the sign in button
    Then I should be presented with the unsuccessful login message

