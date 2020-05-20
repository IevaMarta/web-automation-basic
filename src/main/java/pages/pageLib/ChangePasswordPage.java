package pages.pageLib;

import com.codeborne.selenide.SelenideElement;
import pages.PageManager;

public class ChangePasswordPage extends BasePage {
  //Constructor
  public ChangePasswordPage() {
    addElement("title", "//h1[contains(., 'Change Password')]");
    addElement("currentPasswordField", "input[id = 'currentPassword']");
    addElement("newPasswordField", "input[id = 'newPassword']");
    addElement("repeatNewPasswordField", "input[id = 'newPasswordRepeat']");
    addElement("change", "button[id = 'changeButton']");
    addElement("accountButton", "button[id='navbarAccount']");
  }
  @Override
  public SelenideElement getMainElement() {
    return getElement("title");
  }

  public void navigate(String element) {
    switch (element){
      case "accountButton": PageManager.setCurrentPage(PageManager.getHomePageLoggedIn()); break;
      default               : super.navigate(element);
    }
  }
}
