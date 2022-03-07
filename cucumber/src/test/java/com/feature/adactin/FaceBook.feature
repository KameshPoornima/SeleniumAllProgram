Feature: FaceBook Functionalities

Scenario Outline: Login Functionality on FaceBook
Given User Launched The Broswer
When User Enters on URL
When User Enters on "<Email id (or) Phone Number>"
When User Enters on password "<Password>"
When Click on Login Button
Then if Verifies the Login Functionality

Examples:
|Email id (or) Phone Number|Password|
|kameshkalai60@gmail.com|14411617|
|kameshkalai60@gmail.com|1441617|
|kameshkalai6@gmail.com|14411617|