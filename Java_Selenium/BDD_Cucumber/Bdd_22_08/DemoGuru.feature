Feature: User Registration

  As a new user
  I want to register on the website
  So that I can create an account successfully

  Scenario Outline: Successful registration with valid details
    Given the user is on the registration page
    When the user enters "Saswat" as first name
    And the user enters "Pati" as last name
    And the user enters "9876543210" as phone
    And the user enters "saswatliku@example.com" as email
    And the user enters "lc-147/23, Sailashree vihar , Chandrasekharpur" as address
    And the user enters "Bhubaneswar" as city
    And the user enters "Odisha" as state
    And the user enters "751024" as postal code
    And the user selects "INDIA" as country
    And the user enters "<username>" as username
    And the user enters "<password>" as password
    And the user enters "<confirmPassword>" as confirm password
    And the user clicks on submit button
    Then the registration should be successful

    Examples:
      | username      | password    | confirmPassword |
      | saswatliku123 | Test@12345  | Test@12345      |
      | liku987       | Liku@2025   | Liku@2025       |
