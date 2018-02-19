### Automated Test of [![Adidas APIs]()](https://www.adidas.fi/api) with SOAPUI

- Environment & Tools
 * OS: Windows/Linux
 * Java7/Java8
 * maven2/maven3
 * SOAPUI v5.1.2 or higher 
 * Internet connection

Target Endpoint: https://www.adidas.fi/api/pages/landing?path=/

### Run Test Cases in local and generate report

 * Clone the repositry
 * Go to the directory 
 * run the following commad to execute test cases and generate reports
   - `mvn clean test`
 * To check the report - 
   - Check `{$repo}/src/target/site/junit-noframes.html` file
   
   
### Test Scenarios
- LandingPage
	* LandingPageStatus
		* Assertion HTTP Status 200
		* Response SLA
		* Script Assertion `assert messageExchange.timeTaken < 1000`
- LandingPageImageCheck
	* LandingPageImageUrl with image url asserttion with value
	* ValidateImages (manual insertion of 3 url desktop, table, mobile)
- LandingPageAnalyticsComponent
	* LandingPageAnalyticsData
	* ValidateAnalyticsComponent(Script)
- LandingPageInvalidDomain
	* 510 Status www.adidas.com (Not Sure)
- LandingPageInvalidRequest
	* 404 Status
