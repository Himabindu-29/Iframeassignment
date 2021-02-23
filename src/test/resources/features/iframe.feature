Feature: Tests to validate the iframe functionality
Scenario: Test to validate the help frame
Given I am in home page
When I am click the help button
And I swtich to the help frame
Then I should see the help frame
