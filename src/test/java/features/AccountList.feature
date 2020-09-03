Feature: Verify Amazon India - Accounts and Link menubar have appropriate options for List and Accounts nario: Mobile link is working on Amazon home page 

Scenario: Your List options has appropriate list options displayed
	Given I am on AmazonIndia home page
	When I hover over Accounts and Links section 
	Then Appropriate link options are displayed under Your List section

Scenario: Your Account section has appropriate list options displayed 
	Given I am on AmazonIndia home page
	When I hover over Accounts and Links section 
	Then Appropriate list options options are displayed under Your Account section