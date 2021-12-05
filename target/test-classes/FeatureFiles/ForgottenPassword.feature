@ForgotPassword @smoke
Feature: 
  Reset the password by Clicking Forgotton Password in facebook

@sanity @regression
  Scenario: 
    Reset the password with mobile number or email for facebook

    
    Given  The User should load the URL of facebook
      | https://en-gb.facebook.com/ |
    And The User should maximize the window
    When The User should click the ForgottonPassword
    Then The User should directed to reset password page
    And The user should type the mobile number or email
      | Mobile     | Email    |
      | 9876543210 | kartik   |
      | 9874982385 | selenium |
    
