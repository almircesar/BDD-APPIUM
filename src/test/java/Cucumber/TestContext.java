package Cucumber;

import Managers.ScreenObjectManager;
import Managers.WebDriverOpen;

public class TestContext {
	private WebDriverOpen driverManager;
	private ScreenObjectManager pageObjectManager;

	public TestContext() {
		driverManager = new WebDriverOpen();
		pageObjectManager = new ScreenObjectManager(driverManager.getDriver());
	}

	public WebDriverOpen getDriverManager() {
		return driverManager;
	}

	public ScreenObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

	}
