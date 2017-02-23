package com.mvp.java.controllers;

import com.mvp.java.view.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by Leandro on 22/02/2017.
 */
@Component
public class MenuController implements FxmlController {

    @FXML
    private MenuItem btnImportar;
    private StageManager stageManager;

    @Autowired
    @Lazy
    public MenuController(StageManager stageManager) {
        this.stageManager = stageManager;
    }

    @Override
    public void initialize() {

    }

    public void onImportarClick(ActionEvent event){
        System.out.println("Clicou");
    }
}
