package com.example.agency.model.CRUD;

import com.example.agency.view.CRUDActivity;

public abstract class CRUD {
  protected String[] labels;
  protected String source;
  protected String[] boxes;


    public CRUD(){
        labels = new String[5];
    }

    protected abstract void setLabels();
    protected abstract  void setSource();
    public abstract void create(CRUDActivity context);

    public String[] getLabels(){
        return labels;
    }

    public void setBoxes(String [] fields){
        boxes = fields;
    }
}
