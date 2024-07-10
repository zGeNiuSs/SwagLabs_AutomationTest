Feature: User show products image

  Background:
    Given the user is on the SwagLabs login page


  Scenario: User tries to purchase 3 products
    When user logs in with username "standard_user" and password "secret_sauce"
    And user press on Login button
    Then user could login successful and should be redirected to the products page

    When user press on Add to cart button to add product "sauce-labs-backpack" in cart
    And user press on Add to cart button to add product "sauce-labs-bike-light" in cart
    And user press on Add to cart button to add product "sauce-labs-bolt-t-shirt" in cart
    And user press on the cart icon on the top right of the page
    Then Verify that all 3 products appear in the cart

    When user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "Mohamed", lastname "Ahmed" and postal code "11211"
    And user press on Continue button
    Then user should be redirect to Checkout Overview page

    When user press on Finish button
    Then user should see a message "Thank you for your order!"


  Scenario: User tries to purchase 4 products
    When user logs in with username "standard_user" and password "secret_sauce"
    And user press on Login button
    Then user could login successful and should be redirected to the products page

    When user press on Add to cart button to add product "sauce-labs-backpack" in cart
    And user press on Add to cart button to add product "sauce-labs-bike-light" in cart
    And user press on Add to cart button to add product "sauce-labs-bolt-t-shirt" in cart
    And user press on Add to cart button to add product "sauce-labs-fleece-jacket" in cart
    And user press on the cart icon on the top right of the page
    Then Verify that all 4 products appear in the cart

    When user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "Mohamed", lastname "Ahmed" and postal code "11211"
    And user press on Continue button
    Then user should be redirect to Checkout Overview page

    When user press on Finish button
    Then user should see a message "Thank you for your order!"


  Scenario: User tries to purchase 3 quantities of the same product
    When user logs in with username "standard_user" and password "secret_sauce"
    And user press on Login button
    Then user could login successful and should be redirected to the products page

    When user press on Add to cart button to add same product "sauce-labs-backpack" 3 times in cart
    And user press on the cart icon on the top right of the page
    Then Verify that all 3 products appear in the cart

    When user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "Mohamed", lastname "Ahmed" and postal code "11211"
    And user press on Continue button
    Then user should be redirect to Checkout Overview page

    When user press on Finish button
    Then user should see a message "Thank you for your order!"