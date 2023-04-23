Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given User is already on Login Page
When Title of login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on home page
Then User clicks on Add Contact button
Then user move to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<companyname>"
Then user clicks on Save button
Then close browser

Examples:
	| username | password | firstname | lastname | companyname |
	| naveen909loy@gmail.com | LOYola909 | liliana | dsouza | metro |
	| naveen909loy@gmail.com | LOYola909 | Mathew | Perry | douche |