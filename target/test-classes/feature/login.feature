Feature: User Sessions
  A user should be able to log in and log out of the umami drupal site

  Scenario: User can log in
    Given a user is on the umami website
    And clicks the Log In button
    When the user enters "mfriend" in the username field
    And the user enters "badcamp1" in the password field
    And clicks on the Log In button
    Then the user will be logged in