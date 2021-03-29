#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@VegShoppingPortal
Feature: Search for Vegetable and Add to cart
  In order to verify if search and add to cart is working fine

  @SearchAndToCart
  Scenario: Search items and Add to cart
    Given User is on GreenKart landing page
    When User searched for "Brinjal" vegetable
    And Added items to cart
    And User proceeded to checkout page
    Then verify selected "Brinjal" items are displayed in checkout page

