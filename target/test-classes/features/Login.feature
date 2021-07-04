Feature: Application Login
@WebTest
Scenario: Home Page default Login 
	Given User is on NetBanking Landing Page 
	When User login into Application with UserName "Jin" and Password "1234" 
	Then Home Page is populated 
	And Cards displayed are "True" 
@MobileTest
Scenario: Home Page default Login 
	Given User is on NetBanking Landing Page 
	When User login into Application with UserName "Jhon" and Password "4321" 
	Then Home Page is populated 
	And Cards displayed are "False" 
@MobileTest
Scenario: Home Page default Login 
	Given User is on NetBanking Landing Page 
	When User Sign Up with following details 
		|Jenny|abcd|john@abcd.com|Australia|123321|		
	Then Home Page is populated 
	And Cards displayed are "False" 
@SanityTest
Scenario Outline: : Home Page default Login 
	Given User is on NetBanking Landing Page 
	When User login with UserName <UserName> and Password <Password> 
	Then Home Page is populated 
	And Cards displayed are "True" 
	Examples: 
		|UserName|Password|
		|user1|pass1|
		|user2|pass2|
		|user3|pass3|
		|user4|pass4|
	