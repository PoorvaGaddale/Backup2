$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/shopping.feature");
formatter.feature({
  "name": "Search for Vegetable and Add to cart",
  "description": "  In order to verify if search and add to cart is working fine",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@VegShoppingPortal"
    }
  ]
});
formatter.scenario({
  "name": "Search items and Add to cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@VegShoppingPortal"
    },
    {
      "name": "@SearchAndToCart"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on GreenKart landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_is_on_greenkart_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searched for \"Brinjal\" vegetable",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.user_searched_for_something_vegetable(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Added items to cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.added_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User proceeded to checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.user_proceeded_to_checkout_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify selected \"Brinjal\" items are displayed in checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.verify_selected_something_items_are_displayed_in_checkout_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});