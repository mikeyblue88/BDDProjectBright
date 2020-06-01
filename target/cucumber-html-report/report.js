$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resource/Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage functionality",
  "description": "",
  "id": "homepage-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13207151600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "search product",
  "description": "",
  "id": "homepage-functionality;search-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on the homepage of the argos website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user wants to search for product",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should see all the relevant searched products.",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.user_is_on_the_homepage_of_the_argos_website()"
});
formatter.result({
  "duration": 276362100,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.user_wants_to_search_for_product()"
});
formatter.result({
  "duration": 8318546200,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.user_should_see_all_the_relevant_searched_products()"
});
formatter.result({
  "duration": 231673400,
  "status": "passed"
});
formatter.after({
  "duration": 75400,
  "status": "passed"
});
formatter.before({
  "duration": 9766451900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Clicking on the account button",
  "description": "",
  "id": "homepage-functionality;clicking-on-the-account-button",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user is on the homepage of the argos website",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user clicks on the account button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should see the detail of account.",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.user_is_on_the_homepage_of_the_argos_website()"
});
formatter.result({
  "duration": 150753000,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.userClicksOnTheAccountButton()"
});
formatter.result({
  "duration": 3320989100,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.userShouldSeeTheDetailOfAccount()"
});
formatter.result({
  "duration": 52500,
  "status": "passed"
});
formatter.after({
  "duration": 30600,
  "status": "passed"
});
});