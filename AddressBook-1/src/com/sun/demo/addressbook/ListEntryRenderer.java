/*
 * ListEntryRenderer.java
 *
 * Copyright 2006 Sun Microsystems, Inc. ALL RIGHTS RESERVED Use of 
 * this software is authorized pursuant to the terms of the license 
 * found at http://developers.sun.com/berkeley_license.html .
 *
 */

package com.sun.demo.addressbook;

import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.DefaultListCellRenderer;

/**
 *
 * @author John O'Conner
 *
 */
public class ListEntryRenderer extends DefaultListCellRenderer {
    
    /**
     * Creates a new instance of ListEntryRenderer
     */
    public ListEntryRenderer() {
    }

    public Component getListCellRendererComponent(JList list, Object value, 
            int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        ListEntry entry = (ListEntry) value;
        this.setText(entry.getName());
        return this;
    }
    
}
