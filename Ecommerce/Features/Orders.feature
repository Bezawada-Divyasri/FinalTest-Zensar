Feature:Login
Scenario:Successfull Login With Credentials
Given open Chrome browser
When  opens URL "https://products.pisystindia.com/Ecommerce/admin/"
And enters Email as "admin@gmail.com" and password as "123456"
And userb Click on Login
Then  pagetitle should be "admin"
And Click on Locations
Then Click on City
Then Click on AddCity
And user enters city as "pune"
Then click on Add
Then user click on main
Then user click on logout
Then title should be "admin"