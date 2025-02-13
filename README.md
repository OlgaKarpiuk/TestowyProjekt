## How to run tests using IntelliJ IDEA

1. If you are using Aqua IDEA plugin is not required, but if you use other IDEA, then you need to download plugin. Plugin makes a link between feature and steps. See section "How to download plugin using
   IntelliJ"
2. Click View -> Tool window -> Maven and in Maven tab click Lifecycle -> Install.
3. Click File -> Settings -> Build, Execution, Deployment, Maven and change property "Maven home path" to "use Maven
   wrapper"
4. Make sure Lombok is enabled and settings 'Enable annotation processing' is enabled.
5. Download Java 17. Click File -> Project Structure and make sure that in each tab Java 17 is set.
6. Run tests:
    - all using right mouse click on features folder under resources and pick option Run
    - specific feature using right mouse click on feature and pick option Run feature: [...]
    - specific tests by using two left mouse click on specific feature and clicking on green arrow icon on specific
      scenario
    - use command `mvnw test`

#### How to download plugin using IntelliJ*

1. Go to File -> Settings
2. Go to Plugin section
3. Change tab to Marketplace
4. Type 'Cucumber for Java' and click Install
5. Restart IntelliJ
6. After plugin installation, all files with .feature extension should not be highlighted and clicking on step line with
   Ctrl should redirect to step definition. If mapping is not working, try to restart IntelliJ using File -> Invalidate
   Caches.
   *New approach suggest just use IDE Aqua which does not require any additional plugins.

#### Properties

By using properties file, change environment to be used for running tests

Files with properties:

- environment.properties:
    - set `env=local` to run test on local user. Make sure you have filled local_user.* properties when you use this prop
    - set `env=test` to run test on test user. Use this option only on Jenkins, to avoid user conflict when many users use the same account. Test user use data from test_user*.properties
    - set `runOnJenkins=true` to run test with configuration adjusted for jenkins run like headless mode
    - set `runOnJenkins=false` to run test with default configuration
    - set `headless=true` to run test with not visible web browser
    - set `headless=false` to run test with visible web browser
    - set `broweser=chrome` to run tests using browser Chrome
    - set `browser=firefox` to run test using browser Firefox