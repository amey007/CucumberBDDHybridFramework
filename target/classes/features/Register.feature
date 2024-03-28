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