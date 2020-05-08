/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Zafrul Hasan Nasim
 */
public class teacher {
    private int tec_id;
    private String tec_name;
    private String tec_email;
   boolean valid; 

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getTec_id() {
        return tec_id;
    }

    public void setTec_id(int tec_id) {
        this.tec_id = tec_id;
    }

    public String getTec_name() {
        return tec_name;
    }

    public void setTec_name(String tec_name) {
        this.tec_name = tec_name;
    }

    public String getTec_email() {
        return tec_email;
    }

    public void setTec_email(String tec_email) {
        this.tec_email = tec_email;
    }

    
    
}
