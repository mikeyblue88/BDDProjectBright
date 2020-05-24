Feature: Filter product selection

Background:
Given user is on the homepage of the argos website
When user wants to search for product
Then user should see all the relevant searched products.
Given user is on the result page of the argos website
When user clicks on the running filter
Then user should see all the products associated with running filter.

Scenario: click on one of the products
  Given user is on the result page of running filter
  When user clicks on one of the products
  Then user should be able to see that product to add in basket