@contact-us  @regression

Feature: Automation Practice - Contact Us Page

  Background:
    Given I access the automation practice contact us page

  Scenario: Validate Successful Submission - Contact Us form
    When I select a subject heading
    And I enter an email address
    And I enter an order reference
    And I attach a file
    And I enter a comment
    And I click on the send button
    Then I should be presented with a successful contact us submission message


  Scenario: Validate Subject is Required - Contact Us form
    When I enter an email address
    And I enter an order reference
    And I attach a file
    And I enter a comment
    And I click on the send button
    Then I should be presented with a missing subject message


  Scenario: Validate Email is Required - Contact Us form
    When I select a subject heading
    And I enter an order reference
    And I attach a file
    And I enter a comment
    And I click on the send button
    Then I should be presented with an invalid email message


  Scenario: Validate Message is Required - Contact Us form
    When I select a subject heading
    And I enter an email address
    And I enter an order reference
    And I attach a file
    And I click on the send button
    Then I should be presented with message cannot be blank


  Scenario: Validate Message do Not Accept Only Spaces - Contact Us form
    When I select a subject heading
    And I enter an email address
    And I enter an order reference
    And I attach a file
    And I enter a comment with only spaces
    And I click on the send button
    Then I should be presented with message cannot be blank


  Scenario: Validate Order Reference Field is Not Required - Contact Us form
    When I select a subject heading
    And I enter an email address
    And I attach a file
    And I enter a comment
    And I click on the send button
    Then I should be presented with a successful contact us submission message


  Scenario: Validate Attach File Field is Not Required - Contact Us form
    When I select a subject heading
    And I enter an email address
    And I enter an order reference
    And I enter a comment
    And I click on the send button
    Then I should be presented with a successful contact us submission message
