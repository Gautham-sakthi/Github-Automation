package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.base.Common;
import com.github.pages.ClickToNewRepo;
import com.github.pages.CreateNewRepo;
import com.github.pages.HomePage;
import com.github.pages.RepoCodePage;
import com.github.pages.SettingsPage;
import com.github.pages.SignInPage;

public class GithubFlow extends Common {

	HomePage homepage;
	SignInPage signinpage;
	RepoCodePage repopage;
	CreateNewRepo createnewrepopage;
	SettingsPage settingspage;
	ClickToNewRepo clicktonewrepo;
	String reponame = "dummyrepo";
	String username = "Gautham-sakthi";

	@BeforeClass
	void setObject() {

		homepage = new HomePage(driver, wait);
		signinpage = new SignInPage(driver, wait);
		repopage = new RepoCodePage(driver, wait);
		createnewrepopage = new CreateNewRepo(driver, wait);
		settingspage = new SettingsPage(driver, wait);
		clicktonewrepo = new ClickToNewRepo(driver, wait);
	}

	@Test(priority = 1)
	public void login() {
		homepage.clicksignin();
		signinpage.login();

	}

	@Test(priority = 2)
	public void createrepo() {
		// TODO Auto-generated method stub
		clicktonewrepo.createnewrepo();
		createnewrepopage.enterreponame(reponame);
		Assert.assertTrue(repopage.isrepocreated(reponame));
	}

	@Test(priority = 3)
	public void deleterepo() {
		// TODO Auto-generated method stub
		repopage.clickSettings();
		settingspage.clickDeleteRepo(reponame, username);
		String delmessage = settingspage.getDeleteMessage();
		System.out.println(delmessage);
		Assert.assertTrue(delmessage.contains("deleted"));

	}
}
