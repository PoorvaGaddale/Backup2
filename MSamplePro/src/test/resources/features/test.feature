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
#Author: poorva.g@royalmail.com

@ValidateBarcode
Feature: Validating Parcels in Different Applications
  In order to validate that
  the barcode is passed to downstream applications
 

  @SearchBarcodePostive
  Scenario Outline: Barcode validation in TES2
    Given that I have "<barcode>" number
    When I check for the tes2 portal
    Then barcode details should be displayed

Examples: 
	| barcode 			 | 
	| MZ078770620GB  |
	| MZ078770647GB	 |    
