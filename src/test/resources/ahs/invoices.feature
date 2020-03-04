Feature: Invoices

Scenario: Verify that patient can see his invoice 

Given Patients logged into the patient portal
When he navigate to invoices menu
#Then he should see atleast see 1 invoice
#Then he should see the total cost to be "50"


Scenario: Verify the patient can open the invoice and see details



Scenario: Verify the patient can send email of his invoice to an email address

@smoke
Scenario: Verify that he can filter with paid and unpaid invoice

Given Patients logged into the patient portal
When he navigate to invoices menu
Then he should see atleast see 12 invoice 
When he selects "Paid" invoices
Then he should see atleast see 1 invoice 
When he selects "UnPaid" invoices
Then he should see atleast see 1 invoice 

