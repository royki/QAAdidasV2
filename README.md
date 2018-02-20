### UI Automation
- Environment & Tools
	- OS: Windows/Linux/Mac
	- Browser: Firefox version 58 /Chrome version 63
	- Java7/Java8
	- maven2/maven3
	- Internet connection

#### _URL:  https://www.adidas.fi_

#### Run Test Cases in local and generate report
- Clone the repositry and checkout the branch `uiAdidas`
	- `git clone https://github.com/royki/QAAdidasV2.git`
	- `git checkout uiAdidas`
- Go to the directory 
	- `cd uiAdidas`
- run the following commad to execute test cases and generate reports
	- `mvn clean site`
- To check the report
	- Check `{$dir}/src/target/site/surefire-report.html` file


#### _Test Scenarios_
- LandingPageTitle
- LogoAdidas
- RegisterPage
