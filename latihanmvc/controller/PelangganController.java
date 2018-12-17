/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ahmadmaula.latihanmvc.controller;

import edu.ahmadmaul.latihanmvc.view.PelangganView;
import edu.ahmadmaula.latihanmvc.model.PelangganModel;
import javax.swing.JOptionPane;

/**
 *
 * @author amxyfa
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    

public void resetForm(PelangganView view){
    String nama = view.getTxtNama().getText();
    String email = view.getTxtEmail().getText();
    String noTelp = view.getTxtTelp().getText();

    if (nama.equals("")&& email.equals("") && noTelp.equals("")) {
            
        } else {
        
        model.resetForm();
        }
    
}

public void simpanForm(PelangganView view){
    String nama = view.getTxtNama().getText();
    String email = view.getTxtEmail().getText();
    String noTelp = view.getTxtTelp().getText();
    
    if (nama.trim().equals("")){
        JOptionPane.showMessageDialog(null, "Nama Masih Kosong");
} else if (email.trim().equals("")) {
        JOptionPane.showMessageDialog(null, "Email Masih Kosong");
} else if (noTelp.trim().equals("")) {
        JOptionPane.showMessageDialog(null, "No Telepon Masih Kosong");
}else{
    model.simpanForm();
}
}

    
}
