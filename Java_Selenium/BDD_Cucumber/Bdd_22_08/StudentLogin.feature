Feature: Student Registration Form Automation

  Scenario: Fill and Submit Student Form
    Given I launch the browser and open the Student Registration Form page
    When I enter "Saswat Pati" as Name
    And I enter "saswatliku@example.com" as Email
    And I select "Male" as Gender
    And I enter "9876543210" as Mobile
    And I fill "06/02/2002" as Date of Birth
    And I enter "Computer Science" as Subjects
    And I choose Hobbies: "Sports", "Reading", "Music"
    And I upload the picture from "C:\\Users\\HP\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-05-09 093533.png"
    And I fill "lc-147/23, Sailashree vihar , Chandrasekharpur" as Current Address
    And I select "Uttar Pradesh" as State and "Lucknow" as City
    Then I submit the form successfully

