Feature: Login functionality

Scenario: Login with valid credentials
Given User has navigated to login page
When User enters valid email address "testautonare1@gmail.com" into the email field
And User has entered valid password "12345" in password field
And User clicks on login button
Then User should get successfully logged in

Scenario: Login with invalid credentials
Given User has navigated to login page
When User enters invalid email address "abc@gmail.com" into the email field
And User has entered invalid password "1234567890" in password field
And User clicks on login button
Then User should not get logged in and should get a proper warning message about credentials mismatch

Scenario: Login with valid email and invalid password
Given User has navigated to login page
When User enters valid email address "testautonare1@gmail.com" into the email field
And User has entered invalid password "1234567890" in password field
And User clicks on login button
Then User should not get logged in and should get a proper warning message about credentials mismatch

Scenario: Login with invalid email and valid password
Given User has navigated to login page
When User enters invalid email address "abc@gmail.com" into the email field
And User has entered valid password "12345" in password field
And User clicks on login button
Then User should not get logged in and should get a proper warning message about credentials mismatch


