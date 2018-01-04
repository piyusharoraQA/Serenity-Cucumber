Feature: Testing FAQ 

@FAQ
Scenario: Verify user navigates to the section page for FAQ

Given User is on splash page
When User clicks on FAQ from admin menu
Then Verify user lands on FAQ page
    
    
@FAQ
Scenario: Verify user is able to View created section on the FAQ Page

Given User is on splash page
When User clicks on FAQ from admin menu
Then Verify user is able to View created section on the FAQ Page 
#
#
#@FAQ
#Scenario: Verify authorized user can rename created sections
#
#Given User is on splash page
#When User clicks on FAQ from admin menu
#Then Verify user lands on FAQ page