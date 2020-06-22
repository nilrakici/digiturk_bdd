$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/feature");
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
  "name": "user fills Create Account form with first name Nil ,lastname Rakici ,password and a random email",
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
  "name": "user provides a test card data detail cardname Test Test  , card number 5890040000000016 , verification number 000  and confirm payment",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user displays a error text",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 17722267505,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefs.user_Navigate_to_Subscribe_Page()"
});
formatter.result({
  "duration": 3726868891,
  "status": "passed"
});
formatter.match({
  "location": "SubscribePageStepDefs.user_Displays_Subscribe_Page()"
});
formatter.result({
  "duration": 19406472,
  "status": "passed"
});
formatter.match({
  "location": "SubscribePageStepDefs.user_Chooses_Monthly_Plan()"
});
formatter.result({
  "duration": 305278303,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageStepDefs.user_Displays_Register_Page()"
});
formatter.result({
  "duration": 1357833701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nil",
      "offset": 47
    },
    {
      "val": "Rakici",
      "offset": 61
    }
  ],
  "location": "CreateAccountPageStepDefs.fill_Registration_Page(String,String)"
});
formatter.result({
  "duration": 470357802,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountPageStepDefs.Create_Account()"
});
formatter.result({
  "duration": 509020393,
  "status": "passed"
});
formatter.match({
  "location": "PaymentMethodPageStepDefs.user_Displays_Payment_Method()"
});
formatter.result({
  "duration": 10272218904,
  "status": "passed"
});
formatter.match({
  "location": "PaymentMethodPageStepDefs.Validate_Amount()"
});
formatter.result({
  "duration": 126487944,
  "status": "passed"
});
formatter.match({
  "location": "PaymentMethodPageStepDefs.makes_Payment_Credit_Card()"
});
formatter.result({
  "duration": 3574817296,
  "status": "passed"
});
formatter.match({
  "location": "CreditCardPageStepDefs.user_Validates_Free_Charge()"
});
formatter.result({
  "duration": 3153255265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Test",
      "offset": 47
    },
    {
      "val": "5890040000000016",
      "offset": 72
    },
    {
      "val": "000",
      "offset": 111
    }
  ],
  "location": "CreditCardPageStepDefs.Fills_Credit_Card(String,String,String)"
});
formatter.result({
  "duration": 8929310086,
  "status": "passed"
});
formatter.match({
  "location": "CreditCardPageStepDefs.user_Displays_Error_Message()"
});
formatter.result({
  "duration": 4613457589,
  "status": "passed"
});
});