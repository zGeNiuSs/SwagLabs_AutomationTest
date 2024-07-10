Feature: User show products image

  Background:
    Given the user is on the SwagLabs login page


  Scenario: User wants to buy 3 products then remove 1 from the cart
    When user logs in with username "standard_user" and password "secret_sauce"
    And user press on Login button
    Then user could login successful and should be redirected to the products page

    When user press on Add to cart button to add product "sauce-labs-backpack" in cart
    And user press on Add to cart button to add product "sauce-labs-bike-light" in cart
    And user press on Add to cart button to add product "sauce-labs-bolt-t-shirt" in cart
    And user press on the cart icon on the top right of the page
    Then Verify that all 3 products appear in the cart

    When user remove product "sauce-labs-bike-light" from the cart
    Then Verify that all 2 products appear in the cart
    And Verify that product "Sauce Labs Bike Light" is not appear in the cart

    When user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "Mohamed", lastname "Ahmed" and postal code "11211"
    And user press on Continue button
    Then user should be redirect to Checkout Overview page

    When user press on Finish button
    Then user should see a message "Thank you for your order!"