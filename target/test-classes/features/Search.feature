Feature: Search and place order for vegitable

@SeleniumTest1
Scenario: Search for items and validate the results
Given User is on Greencart Landing page
When User searched for Cucumber vegitable
Then "Cucumber" results are displayed


@SeleniumTest2
Scenario Outline: Search for items and move to checkout page
Given User is on Greencart Landing page
When User searched for <Name> vegitable
And Added items to cart
And User proceeded to Checkout page for purchase
Then verify selected <Name> items are displayed in Checkout page

Examples: 
		|Name	 |
		|Brinjal |
		|Beetroot|


