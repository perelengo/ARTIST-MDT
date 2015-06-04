/*******************************************************************************
 * Copyright (c) 2014 Spikes N.V.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spikes - Initial implementation
 * 	Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.migration.mdt.dotnet.sharepointmodel2uml.model;

import java.util.ArrayList;
import java.util.List;

public class ContentType {
	
	protected String id;
    protected String name;
    protected List<Object> fieldRef;
    
    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public List<Object> getFieldRef() {
        if (fieldRef == null) {
            fieldRef = new ArrayList<Object>();
        }
        return this.fieldRef;
    }
}