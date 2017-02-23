package com.mvp.java.controllers;

import com.mvp.java.services.MissionsService;
import com.mvp.java.view.FxmlView;
import com.mvp.java.view.StageManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CorpoController {


    private StageManager stageManager;

    @FXML
    private Button btnOk;

    @Autowired
    MissionsService service;

    public void initialize() {
        ObservableList<String> missions = FXCollections.observableArrayList("Apollo", "Shuttle", "Skylab");

    }

    @Autowired @Lazy
    public CorpoController(StageManager stageManager) {
        this.stageManager = stageManager;
    }

    @FXML
    private void onMouseClicked(MouseEvent event) {

    }


    public String getInfo(String selectedItem) {
        String missionInfo = null;


        return missionInfo;
    }


    @FXML
    private void onOkClicked(){
        System.out.println("Clicou");
        stageManager.switchScene(FxmlView.TESTE);
    }

}
