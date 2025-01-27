 Feature: Example Scenario
   Background:
     Given setting driver
    @RegressionTest
    Scenario Outline: go to web site and login test
      Given go to login page
      And user types username as "<<username>>"
      And user types password as "<<password>>"
      When click button
      Then assert to success message
      Examples:
        |username|password|
        |student|Password123|
    @SmokeTest
    Scenario: home page go to loading
      Given go to home page
      When wait two seconds
      Then see "Hello" text


