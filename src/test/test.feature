Feature: Use the website to find restaurants
#  So that I can order food
#  As a hungry customer
#  I want to be able to find restaurants in my area
Scenario: Search for restaurants in an area
  Given I want food in "AR51 1AA"
  When I search for restaurants
  Then I should see some restaurants in "AR51 1AA"
Scenario: Search for restaurants using Town name
  Given I want food in "Ruislip"
  When I enter the search term into the search field
  Then I should see get an appropriate error message - "Please enter a full, valid postcode"
Scenario: Search for restaurants in the manchester area
  Given I want food in "Manchester" metropolitan area
  When I click on the "Manchester" link in the footer
  Then I should see some restaurants in "Manchester"