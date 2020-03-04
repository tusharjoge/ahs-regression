Feature: Change Password

@appointment
    Scenario: User should be able to change the password

    Given "Superadmin" logs into the application
    When he click on Superadmin button and select Change Password option
    Then he should be nevigate to change password page
    When he enter old password and new password and confirm new password
    And click on save button
    Then he should navigate to home page



