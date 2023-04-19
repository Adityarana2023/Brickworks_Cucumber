


@SmokeFeature
Feature: Validate Map or event search functionality

@smoketest
Scenario: Validate Map search is working
Given map selection page
And user is on map search page
When user enters a existing map in search box
And hit the enter on Go button
Then user is navigated to search results
