Feature: Appointment Details

  @appointment

  Scenario Outline: Appointment record should be visible in this page with detail

    Given "Superadmin" logs into the application
    When he navigate to "Registration" page
    And user confirms his status if he is "Existing"
    And user clicks on "Time" field
    And user prefers "00:30" as a prefered time
#   When user selects "App Date" as ""
#   And create an appointment with "<Name>","<Age>","<Gender>","<Doctor>","<Date>","<Time>","<Branch>","<Mobile>","<Address>","<Amount>"
#   When he navigate to "appointment page"
#   Then he should see the appointment record with "<Name>"


    Examples:
      | Name     | Age | Gender | Doctor        | Date       | Time  | Branch         | Mobile     | Address      | Amount |
      | Sample12 | 12  | Male   | Sample Doctor | 21/01/2020 | 10:00 | Vishakhapatnam | 1234567890 | test address | 100    |





