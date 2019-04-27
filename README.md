# automated-web-testing-with-selenium-and-webdriver-using-java
Automated Web Testing with Selenium and WebDriver Using Java

# Selenium Server
 - `java -jar selenium-server-standalone-3.141.59.jar`
 - grid: 
   - hub: `java -jar selenium-server-standalone-3.141.59.jar -role hub`
   - node: `java -jar selenium-server-standalone-3.141.59.jar -role node -hub http://localhost:4444/grid/register/`
   - verify it on website: http://localhost:4444/grid/console/
