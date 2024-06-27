Feature: User purchase products

  Background:
    Given the user is on the SwagLabs login page

  Scenario: User try to buy products after using sort from A to Z
    When user logs in with username "standard_user" and password "secret_sauce"
    Then user could login successful
    And user should be redirected to the products page

    When user press on the sorting dropdown list
    And user choose "Name (A to Z)"
    Then Productes are sorted from A to Z successfully

    When user press on Add to cart button to add product "Sauce Labs Backpack" in cart
    And user press on the cart icon on the top right of the page
    Then product "Sauce Labs Backpack" should appear in the cart page

    When user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "Mohamed", lastname "Ahmed" and postal code "11211"
    And user press on Continue button
    Then user should be redirect to Checkout Overview page

    When user press on Finish button
    Then user should see a message "Thank you for your order!"


  Scenario: User try to buy products after using sort from Z to A
    When user logs in with username "standard_user" and password "secret_sauce"
    Then user could login successful
    And user should be redirected to the products page

    When user press on the sorting dropdown list
    And user choose "Name (Z to A)"
    Then Productes are sorted from Z to A successfully

    When user press on Add to cart button to add product "Sauce Labs Onesie" in cart
    And user press on the cart icon on the top right of the page
    Then product "Sauce Labs Onesie" should appear in the cart page

    When user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "Mohamed", lastname "Ahmed" and postal code "11211"
    And user press on Continue button
    Then user should be redirect to Checkout Overview page

    When user press on Finish button
    Then user should see a message "Thank you for your order!"


  Scenario: User try to buy products after using sort from Low to High price
    When user logs in with username "standard_user" and password "secret_sauce"
    Then user could login successful
    And user should be redirected to the products page

    When user press on the sorting dropdown list
    And user choose "Price (low to high)"
    Then Productes are sorted from low to high price successfully

    When user press on Add to cart button to add product "Sauce Labs Onesie" in cart
    And user press on the cart icon on the top right of the page
    Then product "Sauce Labs Onesie" should appear in the cart page

    When user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "Mohamed", lastname "Ahmed" and postal code "11211"
    And user press on Continue button
    Then user should be redirect to Checkout Overview page

    When user press on Finish button
    Then user should see a message "Thank you for your order!"


  Scenario: User try to buy products after using sort from High to Low price
    When user logs in with username "standard_user" and password "secret_sauce"
    Then user could login successful
    And user should be redirected to the products page

    When user press on the sorting dropdown list
    And user choose "Price (High to Low)"
    Then Productes are sorted from High to Low price successfully

    When user press on Add to cart button to add product "Sauce Labs Onesie" in cart
    And user press on the cart icon on the top right of the page
    Then product "Sauce Labs Onesie" should appear in the cart page

    When user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "Mohamed", lastname "Ahmed" and postal code "11211"
    And user press on Continue button
    Then user should be redirect to Checkout Overview page

    When user press on Finish button
    Then user should see a message "Thank you for your order!"