Feature: User Sessions
  A user should be able to log in and log out of the umami drupal site

  @BeforeClass @Test
  Scenario: User can log out
    Given a user is on the umami website
    And a user is logged in
    When the user clicks the log out button
    Then the user will be logged out