#Author - Aditya Rana
#Date - 17th April, 2023
#Description - Create test script for login functionality of BrickWorks

@SmokeFeature
Feature: feature to test login functionality

@smoketest
  Scenario: Check login is successfully with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the map selection page

    