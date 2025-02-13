package setup;

import java.io.IOException;
import java.util.Properties;


public enum EnvironmentProperties {

    ENVIRONMENT_PROPERTIES;
    private final Properties prop;

    EnvironmentProperties() {
        prop = new Properties();
        try {
            prop.load(getClass().getClassLoader().getResourceAsStream("environment.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public String getUser() {
        if (System.getProperty("user") == null) {
            return prop.getProperty("user");
        } else {
            return System.getProperty("user");
        }
    }

    public String isBrowserOpenAfterTests() {
        if (System.getProperty("browserOpenAfterTests") == null) {
            return prop.getProperty("browserOpenAfterTests");
        } else {
            return System.getProperty("browserOpenAfterTests");
        }
    }

    public String isJenkinsRun() {
        if (System.getProperty("runOnJenkins") == null) {
            return prop.getProperty("runOnJenkins");
        } else {
            return System.getProperty("runOnJenkins");
        }
    }

    public String getBaseUrl() {
        if (System.getProperty("baseUrl") == null) {
            return prop.getProperty("baseUrl");
        } else {
            return System.getProperty("baseUrl");
        }
    }

    public String getBrowser() {
        if (System.getProperty("browser") == null) {
            return prop.getProperty("browser");
        } else {
            return System.getProperty("browser");
        }
    }

    public String isHeadless() {
        if (System.getProperty("headless") == null) {
            return prop.getProperty("headless");
        } else {
            return System.getProperty("headless");
        }
    }

}