package fr.istic.client;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("dataService")
public interface ManageData extends RemoteService, Serializable {
	
	public Integer getNumber();
	public void setNumber(Integer value);

}
