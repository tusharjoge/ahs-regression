Feature: Group Test


Scenario Outline: Verify super admin can create group test

Given Super admin logged in
And he navigated to group test page
When he opens the add group test page
And enter Group Test Name as "<Group Test Name>" and Price as "<Price>"
And submit the data to create new group test
Then he should be navigated to list of group test age
And the "<Group Test Name>" should be available in the list
And the "<Price>" should match

Examples:

|Group Test Name|Price|
|Sample Test    |10   |




Scenario: Verify super admin cannot create a group test with out valid information

Scenario: Verify super admin can search the group test in the group test list

Scenario: Verify super admin can delete the group test successfully

Scenario: Verify super admin can change the status of the group test

Scenario: Veirfy group test created are available while registering a diognistic test

Scenario: Veirfy group test created are available while creating a assign group test

