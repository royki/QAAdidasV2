### Automated Test of [![Adidas APIs]()](https://www.adidas.fi/api) with SOAPUI

- Environment & Tools
 * OS: Windows/Linux
 * Java7/Java8
 * maven2/maven3
 * SOAPUI v5.1.2 or higher 
 * Internet connection

Target Endpoint: https://www.adidas.fi/api/pages/landing?path=/

### Run Test Cases in local and generate report

 * Clone the repo
 * Go to the directory 
 * run the following commad to execute test cases and generate reports
   - mvn clean test
 * To check the report - 
   - Check {$repo}/src/target/site/junit-noframes.html file
