@smoke
Feature: Performance after load check

  Scenario: Load service
    Given init service example
    When load service for 5 seconds with 'getMethod' request
    Then performance result doesn't have any fails
    And the average response time is less than 2 seconds

  Scenario: Load service by concurrent threads
    Given init service example
    When load service by 2 concurrent threads for 5 seconds with 'getMethod' request
    Then performance result doesn't have any fails
    And the average response time is less than 2 seconds