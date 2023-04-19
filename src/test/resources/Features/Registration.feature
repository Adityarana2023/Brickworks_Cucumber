Feature: User Registration

Background:
Given User navigates to Registration page
@register @mandatoryfields @smoke @regression

Scenario: Registration with mandatory fields
When User enters fullname "Aditya Rana" into the name field
And Enters Email name "aditya@xperate.com" into the email field
And Enters Company name "ABC1" into the company field
And Enters phone number "98522222114" into the Phone field
And Enters Password  "Aditya@123456" into the Passwordy field
And Enters Password confirm  "Aditya@123456" into the Password confirm field
And Clicks on "Create an Account" button
Then Registration should get successfully created
