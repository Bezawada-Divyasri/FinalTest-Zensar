Feature:Login
Scenario:Successful Login with valid credentials
Given open chrome browser
Then opens url "https://xlogist.pisystindia.com/admin/login"
And user enters email as "admin@gmail.com" and password as "Charlie123"
Then user click on signin
Then title should be "Admin Dashboard"
And click on locations
Then click on country
And click on Addcountry
Then user enters the country as "  vijayawada"
Then click on add
And click on Main
Then click on logout



