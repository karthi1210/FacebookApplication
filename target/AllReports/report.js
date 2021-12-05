$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/FBLogin.feature");
formatter.feature({
  "name": "",
  "description": "  To validate Login page of Facebook",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FBLogin"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "    To validate Login page of Facebook with Invalid Username and Invalid Password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FBLogin"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The User Should load the url of the Facebook",
  "rows": [
    {
      "cells": [
        "URL",
        "https://en-gb.facebook.com/"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_User_Should_load_the_url_of_the_Facebook(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User should maximize the Window",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_User_should_maximize_the_Window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User should type the Invalid Username and Invalid Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "karthik",
        "karti@123"
      ]
    },
    {
      "cells": [
        "java",
        "java@123"
      ]
    },
    {
      "cells": [
        "selenium",
        "selenium@123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_User_should_type_the_Invalid_Username_and_Invalid_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_User_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User should directed to Invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_User_should_directed_to_Invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/FeatureFiles/ForgottenPassword.feature");
formatter.feature({
  "name": "",
  "description": "  Reset the password by Clicking Forgotton Password in facebook",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ForgotPassword"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "    Reset the password with mobile number or email for facebook",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ForgotPassword"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The User should load the URL of facebook",
  "rows": [
    {
      "cells": [
        "https://en-gb.facebook.com/"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.the_User_should_load_the_URL_of_facebook(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_User_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User should click the ForgottonPassword",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.the_User_should_click_the_ForgottonPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The User should directed to reset password page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.the_User_should_directed_to_reset_password_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the mobile number or email",
  "rows": [
    {
      "cells": [
        "Mobile",
        "Email"
      ]
    },
    {
      "cells": [
        "9876543210",
        "kartik"
      ]
    },
    {
      "cells": [
        "9874982385",
        "selenium"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.the_user_should_type_the_mobile_number_or_email(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});