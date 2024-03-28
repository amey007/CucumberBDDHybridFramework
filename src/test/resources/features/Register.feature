Feature: Registeration Functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to register account page
When User enters the details into below fields
|firstName	|Test										|
|lastName		|Auto										|
|email			|testautonare2@gmail.com|
|telephone 	|1234567890							|
|password		|12345									|
And User selects privacy policy
And User clicks on Continue button
Then User account should be created successfully

Scenario: User creates an account with all fields
Given User navigates to register account page
When User enters the details into below fields
|firstName	|Test										|
|lastName		|Auto										|
|email			|testautonare2@gmail.com|
|telephone 	|1234567890							|
|password		|12345									|
And User selects Yes for Newsletter
And User selects privacy policy
And User clicks on Continue button
Then User account should be created successfully

Scenario: User creates a duplicate account
Given User navigates to register account page
When User enters the details into below fields
|firstName	|Test										|
|lastName		|Auto										|
|email			|testautonare2@gmail.com|
|telephone 	|1234567890							|
|password		|12345									|
And User selects Yes for Newsletter
And User selects privacy policy
And User clicks on Continue button
Then User account should not be created and should get proper warning about duplicate email

Scenario: User creates an account without filling any details
Given User navigates to register account page
When User does not enter any details into fields
And User clicks on Continue button
Then User should get proper warning for every mandatory field