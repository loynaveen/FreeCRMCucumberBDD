Feature: Free CRM Application Testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: Login with Incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a deal test case

@RegressionTest
Scenario: Create a task
Given This is a contact task case

@SmokeTest
Scenario: Create a case
Given This is a case test case

@End2End
Scenario: Verify left panel links
Given Clicking on left panel links

@End2End
Scenario: Search a deal
Given Search deal test

@End2End
Scenario: Search a contact
Given Search contact test

@End2End
Scenario: Search a case
Given Search case test

@End2End
Scenario: Search a task
Given Search task test

@End2End
Scenario: Search a call
Given Search call test

@End2End
Scenario: Search a email
Given Search email test

@SmokeTest @RegressionTest
Scenario: Search a docs
Given Search docs test

@End2End
Scenario: Search a forms
Given Search forms test

@End2End
Scenario: Search a report
Given Search report test

@SmokeTest @RegressionTest @End2End
Scenario: Application Logout
Given clicking on logout button