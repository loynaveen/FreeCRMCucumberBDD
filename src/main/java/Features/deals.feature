Feature: Deals data creation

Scenario Outline: Free CRM Create a new deal scenario

Given User is already on Login Page
When Title of login page is Free CRM
Then User enters username and password
| naveen909loy@gmail.com | LOYola909 |
Then User clicks on login button
Then User is on home page
Then User clicks on Deals button
Then user enters deal details
| test deal | 1000 | 50 | 10 |
Then user clicks on Save button
Then close browser