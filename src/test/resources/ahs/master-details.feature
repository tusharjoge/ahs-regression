Feature: Verify the master details of the super admin


  Scenario Outline: Verify admin can create users

    Given super admin is logged in
    When he navigate to User details
    And create a new user "<Name>","<Mobile Number>","<EmailID>","<Password>","<UserType>" and "<Branch Name>"
    Then the user should be created successfully
    And when he navigate to list of user
    Then admin should see the record with "<Name>","<UserType>" and "<Mobile Number>"

    Examples:
      | Name | Mobile Number | EmailID         | Password | UserType | Branch Name |
      | Test | 12345678      | test@test12.com | London12 | Admin    | default     |


