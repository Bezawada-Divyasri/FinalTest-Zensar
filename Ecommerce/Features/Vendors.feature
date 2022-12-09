Feature:Login
Scenario:Successfull Login With Credentials
Given Chrome browser
When User opens URL "https://products.pisystindia.com/Ecommerce/admin/"
And User enters Email as "admin@gmail.com" and password as "123456"
And Click on Login
Then Page Title should be "admin"
And Click on Vendors
And click on check
And Click on Add Vendors
And User enters Name as "Divya" and Address as "pune" and Contact as "9133069568" and Email as "bezavada@gmail"
And Click on Add
Then Title should be "admin"
And Click on Action
And User enters Uname as "teju" and Uaddress as "vizag" and Ucontact as "7890654321" and Uemail as "teju@bangaram"
And Click Update
Then Title should be "admin"
And Click on status
And Click on view
And Click on Allocate
And User enters SelectProduct as "Mahalaxmi Enterprises 3 Ply Face Mask 100's"
Then Click on Addproduct
Then Title should be "admin"
And Click on Main
Then Click on Logout
And close browsers