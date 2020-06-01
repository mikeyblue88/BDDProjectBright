Feature: Homepage functionality


  Scenario: search product
    Given user is on the homepage of the argos website
    When user wants to search for product
    Then user should see all the relevant searched products.


    Scenario: Clicking on the account button
      Given user is on the homepage of the argos website
      When user clicks on the account button
      Then user should see the detail of account.


   # Scenario Outline: search multiple products
    #    Given user is on the homepage of the argos website
     #   When user tries to find multiple "<product>"
      #  Then user should see all the relevant searched products.
       # Examples:
        #|product|
        #|nike   |
        #|puma   |
