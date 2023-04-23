Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario
#
#Given User is already on Login Page
#When Title of login page is Free CRM
#Then User enters "naveen909loy@gmail.com" and "LOYola909"
#Then User clicks on login button
#Then User is on home page


Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page
When Title of login page is Free CRM
Then User enters "<username>" and "<password>"
Then User clicks on login button
Then User is on home page
Then close browser

Examples: 
 	| username | password |
 	| naveen909loy@gmail.com | LOYola909 |
 	| Tom | test456 |
