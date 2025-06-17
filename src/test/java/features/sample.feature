Feature: Google Search

  Scenario: Search something
    Given I open the browser
    When I go to "https://www.google.com"
    Then I see the title contains "Google"