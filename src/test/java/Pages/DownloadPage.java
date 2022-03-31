package Pages;

import Base.BaseForm;
import Base.TextField;
import Logging.Logging;
import org.openqa.selenium.By;

public class DownloadPage extends BaseForm {

    public DownloadPage() {
        super(new TextField(By.xpath("//map[@name='download']"), "uniqueElement"), "DownloadPage");
        Logging.getLogger().info("Download Page");
    }

    private TextField uniqueElement = new TextField(By.xpath("//map[@name='download']"),"uniqueElement");

    public boolean isDownloadPage(){
        if(uniqueElement.isVisible()){
            return true;
        }
        return false;
    }
}
