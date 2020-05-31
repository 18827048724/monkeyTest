import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class BuildProperties {
    private final Properties properties;

    private BuildProperties() throws IOException {
        properties = new Properties();
        FileInputStream is = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
        properties.load(is);
        is.close();
    }

    public String getProperty(final String name, final String defaultValue) {
        return properties.getProperty(name, defaultValue);
    }
