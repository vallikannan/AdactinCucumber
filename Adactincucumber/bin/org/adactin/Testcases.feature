Feature: To check the TestCases in AutomationPage

Background:
Given user Login to the application using "vallikannan"in username and "12345678" in password 
When user clicks the login button

Scenario: To verify valid login details
Then user verify the as it is login to the application

Scenario: To verify whether the check-out date field accepts a later date than check- in date
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "1" 
Then user Enter check-in-date as "23/04/2020"
Then user Enter check-out-date as "21/04/2020"
Then user verify the System should report an error message.

Scenario: To check if error is reported if check-out date field is in the past
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "1" 
Then user Enter check-in-date as "16/04/2020"
Then user Enter check-out-date as "19/04/2020"
Then user verify the System should report an error message as Enter Valid dates

Scenario: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "1" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user receive location from select hotel page and verify the locations in Select Hotel page are displayed according to the location selected in Search Hotel

Scenario: To verify whether Check-in date and Check Out date are being displayed in Select Hotel page according to the dates selected in search Hotel
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "1" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user receive check-in- date and check-out- date from select hotel page and verify the Check-in-date and check-out- date should be displayed according to the data entered in search hotel 

Scenario: To verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "3" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user receive No-of-rooms displayed in select hotel page and  verify the No-of-rooms displayed from select hotel page is match with number of rooms in search hotel page

Scenario: To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Deluxe" 
Then user Select no-of-rooms as "1" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user receive Room type displayed in select hotel page and  verify the Room type displayed should be the same as selected in search hotel page
 
Scenario: To verify whether the total price (excl.GST) is calculated as “price per night * no. of nights* no of rooms”
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user receive the  total- price(excl.GST) value and verify the total-price "<250$>"
 

Scenario: To verify when pressed, logout button logs out from the application
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user  Select the hotel and click on continue button
Then  Enter the details and click on book now
Then user clicks on logout and verify and verfiy that have been logged out of the application

Scenario: To check correct total price is being calculated as “price per night*no of days*no of rooms in Book a hotel page
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user  Select the hotel and click on continue button
Then user receives the total price from Book a hotel page and verify that Total-price should be "250$"


Scenario: To check All the datas of booking confirmation should same which all are given in previous page

Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user  Select the hotel and click on continue button
Then  Enter the details and click on book now 
Then user recieve the details from booking confirmation page and verify as that details is same as details which are given in previous page

Scenario: To check correct Final billed price is Total Price + 10% Total price in Book a Hotel page
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user  Select the hotel and click on continue button
Then user receive the  Final billed price and verify the Final billed price is should as "137.5$"
 

Scenario: To verify whether the data displayed in book hotel page is same as the selected data in search hotel page
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user  Select the hotel and click on continue button
Then user receives the data from book hotel page and verify the both should be same

@cancel
Scenario: To Verify Order number is generated in booking confirmation page
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user  Select the hotel and click on continue button
Then  Enter the details and click on book now
Then user Verify Order number is generated in booking confirmation page

Scenario: To verify whether the booked itinerary details are not editable
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user  Select the hotel and click on continue button
Then  Enter the details and click on book now 
Then user  Click on My itinerary button 
Then user  Verify that the details are not editable in booked itinerary page

Scenario: To check whether the booked itinerary reflects the correct information in line with the booking
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user  Select the hotel and click on continue button
Then  Enter the details and click on book now
Then user  Click on My itinerary button 
Then user verify the Itinerary should reflect the correct information in line with the booking

@orderid
Scenario: To check whether “search order id” query is working and displaying the relevant details
Then user  Click on booked itinerary button 
Then user  Enter the order id and click search button
Then user Verify that the relevant details are displayed

Scenario: To Verify that all the details of newly generated order number in booked itinerary page are correct and match with data during booking
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user click the search button
Then user  Select the hotel and click on continue button
Then  Enter the details and click on book now
Then user  Click on My itinerary button 
Then user  Enter the order id and click search button
Then user verify the All the details in booked itinerary page should be same as those entered during booking

@cancel
Scenario: To verify that the order gets cancelled after click on Cancel order number link
Then user  Click on booked itinerary button 
Then user  Enter the order id and click search button
Then user cancel the order which is searched 
Then user verify that order has cancled

Scenario: To Verify Title of every Page reflects what the page objective 
Then user Select location as "Sydney"
Then user  Select hotel as "Hotel Creek" 
Then user Select room type as "Standard" 
Then user Select no-of-rooms as "2" 
Then user Enter check-in-date as "21/04/2020"
Then user Enter check-out-date as "22/04/2020"
Then user Select No-of-adults as "1"
Then user Select No-of-children as "0" 
Then user get the title of Search hotelpage and verify it reflects its objective
Then user click the search button 
Then user get the title of Select hotelpage and verify it reflects its objective 
Then user  Select the hotel and click on continue button
Then user get the title of Select book a hotel page and verify it reflects its objective 
Then  Enter the details and click on book now
Then user get the title of Select booking confirmation page and verify it reflects its objective 
Then user click the booked itinerary option and verify it directs to booked itinerary form
Then user Click on Search hotel option and verify it directs to search hotel form 


