Feature: verifying font size functionality is working properly

Background:
Given Api Demos app is launched


  @test1
  Scenario: verify the allow from screen switch of accessbility is working 
    
    When click on Accessibility option
    Then Accessibility service option appears
    When click on Accessibility service
    Then Api button appears
    When click on Api button
    And click on accessibility shortcut option
    And click on allow from lock screen switch
    Then allow from lock screen is activated


@test2
Scenario Outline: Verify App Option functionality

When User choose app
And User choose activity
And User choose custom title
And User fills form from excel sheet "<SheetName>"
And rownumber <row> and click on change left
Then User can see changes on left top corner <row>

Examples:
|SheetName|row|
|TextBox|0|
|TextBox|1|