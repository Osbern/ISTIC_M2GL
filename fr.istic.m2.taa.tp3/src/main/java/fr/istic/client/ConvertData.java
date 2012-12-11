package fr.istic.client;

import org.EurosDollars.API.EDAPI;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("convertService")
public interface ConvertData extends EDAPI, RemoteService {

}
