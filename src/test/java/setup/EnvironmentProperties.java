package setup;

import java.io.IOException;
import java.util.Properties;

public enum UserProperties {

    USER_PROPERTIES;

        private final Properties prop;
    UserProperties() {
        prop = new Properties();
        try {
            prop.load(getClass().getClassLoader().getResourceAsStream(EnvironmentProperties.ENVIRONMENT_PROPERTIES.getUser() + "_jpk_user.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public String getUsername() {
        if (System.getProperty("username") == null) {
            return prop.getProperty("username");
        } else {
            return System.getProperty("username");
        }
    }

    public String getPassword() {
        if (System.getProperty("password") == null) {
            return prop.getProperty("password");
        } else {
            return System.getProperty("password");
        }
    }

    public String getToken() {
        if (System.getProperty("token") == null) {
            return prop.getProperty("token");
        } else {
            return System.getProperty("token");
        }

    }
