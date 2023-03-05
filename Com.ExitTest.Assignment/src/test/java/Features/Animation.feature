Feature: LogTextbox option of API DEMOS app

Background:
Given Api Demos app is launched and animation option is visible
When User choose option named as Animation

@test3
Scenario: Verifying the functionality named as Default layout animation

Then Default layout option appears
When User click on Default layout animation
And User click on add button
Then User can see a button

@test4
Scenario: Verify the Hide-show animation 

Then Hide-show animation option appears
When User click on Hide-show option
Then button zero is visible
When Click on zero button
Then zero button hide
When click on show button
Then zero button is visible