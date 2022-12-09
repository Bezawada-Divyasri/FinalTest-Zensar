Feature:Login
Scenario:Successfull Login With Credentials
Given Chrome browser
When User opens URL "https://products.pisystindia.com/Ecommerce/admin/"
And User enters Email as "admin@gmail.com" and password as "123456"
And Click on Login
Then Page Title should be "admin"
When User Click NewDemo
When user click on Log Out Link
Then Page Title should be "admin"
And close browsers
Given User Launch Chrome browserwe