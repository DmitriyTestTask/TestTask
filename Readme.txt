This document descibes autotests of the "https://cryptic-retreat-46933.herokuapp.com/" website.

Contact Keeper website
The "https://cryptic-retreat-46933.herokuapp.com/" website helps people to save contact information about people.
a contact can have Name with information like one Email and one phone number. Also contacts can be set like "Personal" or "Professional".

There are 6 GUI and 5 API tests.

GUI tests:
1) CreateNewUser 
2) LogInRegisteredUser
3) AddContact
4) EditContact
5) DeleteContact
6) Logout

API tests:
1) GetWebSite
2) RegistrationNewUser
3) LoginUser
4) AddContact
5) DeleteContact

Comand to run tests (You should use "Terminal")

mvn clean test