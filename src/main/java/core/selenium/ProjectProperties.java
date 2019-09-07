package core.selenium;

/**
 * ProjectProperties enum, create constants
 * to save name properties of project.
 *
 * @author Raul Choque
 * @version 0.0.1
 */
public enum ProjectProperties {

    BROWSER_NAME("browserName");

    private final String browserName;

    /**
     * Constructor of ProjectProperties enum.
     *
     * @param browserName value for create a ProjectProperties enum.
     */
    ProjectProperties(String browserName) {
        this.browserName = browserName;
    }

    /**
     * gets value of browserName constant of this enum.
     *
     * @return as String browserName constant.
     */
    public String getBrowserName() {
        return browserName;
    }
}
