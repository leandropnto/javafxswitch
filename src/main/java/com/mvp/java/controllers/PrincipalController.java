package com.mvp.java.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Leandro on 22/02/2017.
 */
@Component
public class PrincipalController implements FxmlController {

    private MenuController menuController;
    private CorpoController corpoController;

    @FXML
    private BorderPane TabPane;

    @FXML
    private BorderPane Corpo;


    @Autowired
    public PrincipalController(MenuController menuController, CorpoController corpoController) {
        this.menuController = menuController;
        this.corpoController = corpoController;
    }

    @Override
    public void initialize() {

    }

    public MenuController getMenuController() {
        return menuController;
    }

    public BorderPane getCorpo() {
        return Corpo;
    }
}
