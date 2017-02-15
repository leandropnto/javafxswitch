package com.mvp.java.controllers;

import com.mvp.java.view.FxmlView;
import com.mvp.java.view.StageManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


/**
 * Created by Leandro on 14/02/2017.
 */
@Component
public class TesteController implements FxmlController {

    @FXML
    private Button btnTeste;
    private StageManager stageManager;

    @Override
    public void initialize() {

    }

    @Autowired @Lazy
    public TesteController(StageManager stageManager) {
        this.stageManager = stageManager;

    }

    @FXML
    public void btnTestePressed(ActionEvent event){
        stageManager.switchScene(FxmlView.MAIN);
    }



}
