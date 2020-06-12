$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/nilrakici/eclipse-workspace/Digiturk_BDD/src/main/java/features/feature");
formatter.feature({
  "line": 1,
  "name": "Digiturk Automation via BDD",
  "description": "",
  "id": "digiturk-automation-via-bdd",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Bein Sports Connect Australia Subscription Test Case",
  "description": "",
  "id": "digiturk-automation-via-bdd;bein-sports-connect-australia-subscription-test-case",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks Subscribe button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is directed to subscription page and displays package options",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user chooses Monthly Plan with Two Week Free Trial and clicks Subscribe button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is directed to Create Account screen",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user fills Create Account form with first name, last name, password and a random email",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "clicks Create Account button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "a new account is created and payment method screen is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user validates the package price",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user makes payment with credit card",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user expects for a total charge of 1.00 since this is a free trial package",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user provides a test card data detail and confirm payment",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user displays a error text",
  "keyword": "Then "
});
formatter.match({
  "location": "SubscriptionDefs.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 20341582546,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.user_Navigate_to_Subscribe_Page()"
});
formatter.result({
  "duration": 4532635206,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.user_Displays_Subscribe_Page()"
});
formatter.result({
  "duration": 8389510,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.user_Chooses_Monthly_Plan()"
});
formatter.result({
  "duration": 316333759,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.user_Displays_Register_Page()"
});
formatter.result({
  "duration": 2033839774,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.fill_Registration_Page()"
});
formatter.result({
  "duration": 366848574,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.Create_Account()"
});
formatter.result({
  "duration": 439996162,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.user_Displays_Payment_Method()"
});
formatter.result({
  "duration": 12232336240,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.Validate_Amount()"
});
formatter.result({
  "duration": 97524318,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.makes_Payment_Credit_Card()"
});
formatter.result({
  "duration": 3601461422,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.user_Validates_Free_Charge()"
});
formatter.result({
  "duration": 3833037764,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.Fills_Credit_Card()"
});
formatter.result({
  "duration": 9287679757,
  "status": "passed"
});
formatter.match({
  "location": "SubscriptionDefs.user_Displays_Error_Message()"
});
formatter.result({
  "duration": 3639926711,
  "status": "passed"
});
});