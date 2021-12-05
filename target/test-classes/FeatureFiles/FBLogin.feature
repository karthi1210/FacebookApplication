@FBLogin @smoke
Feature: 
  To validate Login page of Facebook

  @sanity @regression
  Scenario: 
    To validate Login page of Facebook with Invalid Username and Invalid Password

    
    Given The User Should load the url of the Facebook
      | URL | https://en-gb.facebook.com/ |
    And The User should maximize the Window
    When The User should type the Invalid Username and Invalid Password
      | Username | Password     |
      | karthik  | karti@123    |
      | java     | java@123     |
      | selenium | selenium@123 |
    And The User should click the login button
    Then The User should directed to Invalid credential page
    
    
    
