Feature: User show products image

  Background:
    Given the user is on the SwagLabs login page

  Scenario: Verify checkout with an empty cart
    When user logs in with username "standard_user" and password "secret_sauce"
    And user press on Login button
    Then user could login successful and should be redirected to the products page

    When user press on the cart icon on the top right of the page
    And user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "Mohamed", lastname "Ahmed" and postal code "11211"
    And user press on Continue button
    Then user should be redirect to Checkout Overview page

    When user press on Finish button
    Then user should see a message "Your cart is empty!"


  Scenario: Verify invalid shipping information during checkout
    When user logs in with username "standard_user" and password "secret_sauce"
    And user press on Login button
    Then user could login successful and should be redirected to the products page

    When user press on Add to cart button to add product "sauce-labs-backpack" in cart
    And user press on the cart icon on the top right of the page
    Then product "Sauce Labs Backpack" should appear on the cart page

    When user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "", lastname "" and postal code ""
    And user press on Continue button
    Then user should see an error message "Error: First Name is required"
