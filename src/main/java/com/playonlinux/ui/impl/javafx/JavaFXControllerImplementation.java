package com.playonlinux.ui.impl.javafx;

import com.playonlinux.api.Controller;
import com.playonlinux.injection.Component;
import com.playonlinux.api.UIMessageSender;
import com.playonlinux.api.SetupWindow;
import com.playonlinux.ui.impl.javafx.setupwindow.JavaFXSetupWindowImplementation;

@Component
public class JavaFXControllerImplementation implements Controller {

    public void startApplication() {
        JavaFXApplication.launch(JavaFXApplication.class);
    }

    public SetupWindow createSetupWindowGUIInstance(String title) {
        return new JavaFXSetupWindowImplementation(title);
    }

    @Override
    public UIMessageSender createUIMessageSender() {
        return new JavaFXMessageSenderImplementation();
    }


}
