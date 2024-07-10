Feature: User show products image

  Background:
    Given the user is on the SwagLabs login page

  Scenario: Validate product selection and image verification
    When user logs in with username "standard_user" and password "secret_sauce"
    And user press on Login button
    Then user could login successful and should be redirected to the products page
    And product image for 6 products should be displayed correctly

    When user press on Add to cart button for each product to add 6 products in cart
    And user press on the cart icon on the top right of the page
    Then Verify that all 6 products appear in the cart

    When user press on Checkout button
    Then user should be redirect to Checkout Information page

    When user enter firstname "Mohamed", lastname "Ahmed" and postal code "11211"
    And user press on Continue button
    Then user should be redirect to Checkout Overview page

    When user press on Finish button
    Then user should see a message "Thank you for your order!"