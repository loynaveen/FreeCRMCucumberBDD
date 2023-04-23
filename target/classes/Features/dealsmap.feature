Feature: Deals data creation

Scenario Outline: Free CRM Create a new deal scenario

Given User is already on Login Page
When Title of login page is Free CRM
Then User enters username and password
|	username | password |
| naveen909loy@gmail.com | LOYola909 |
Then User clicks on login button
Then User is on home page
Then User clicks on Deals button
Then user enters deal details
| title | amount | commission | probability |
| test deal1 | 1000 | 50 | 10 |
| test deal2 | 2000 | 60 | 20 |
| test deal3 | 3000 | 70 | 30 |
Then close browser