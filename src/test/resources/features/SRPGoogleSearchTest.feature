Feature: Google Single Responsibility Principle Search Tests

  Scenario Outline: Search for first suggestion and count results on search
    Given the user navigates to google home page
    And the user enters <Search Keyword>
    And user selects the <Suggestion Index> among suggestions
    When the user goes to news on navigation bar
    Then the user prints the quantity of results found

    Examples:
      | Search Keyword | Suggestion Index |
      | "Selenium"     | 2                |
      | "Docker"       | 3                |