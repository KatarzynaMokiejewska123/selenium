Feature: Login page test

Scenario: Open main page and click in the top bar links
	Given I open main page
	When I click SIGN-ON link
	Then I should see the login page	
	
Scenario: Fill the reservetion form
	Given I open main page
	When I click SIGN-ON link
	Then I should see the login page	
	When I log in as "admdz" with password "qwe123" 
	And I fill one passenger flight
	And From flight: "Paris" at day "10" month "7"
	And To flight: "London" at day "11" month "7"
	And Close the browser
	