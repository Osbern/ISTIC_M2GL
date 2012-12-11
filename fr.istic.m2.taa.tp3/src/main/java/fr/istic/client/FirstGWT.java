package fr.istic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.thirdparty.guava.common.base.Throwables;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.DockPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FirstGWT implements EntryPoint {
	/**
	 * Create a remote service proxy to talk to the server-side Greeting
	 * service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);
	
	private final ManageDataAsync md = GWT
			.create(ManageData.class);

	private final Messages messages = GWT.create(Messages.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		final Button sendButton = new Button(messages.sendButton());
		final TextBox nameField = new TextBox();
		md.getNumber(new AsyncCallback<Integer>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}

			public void onSuccess(Integer result) {
				nameField.setText(result.toString());
			}
		});

		// We can add style names to widgets
		sendButton.addStyleName("sendButton");

		// Add the nameField and sendButton to the RootPanel
		// Use RootPanel.get() to get the entire body element
		RootPanel rootPanel = RootPanel.get();
		rootPanel.add(nameField);
		RootPanel.get().add(sendButton);

		sendButton.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {

				md.setNumber(Integer.parseInt(nameField.getText()), new AsyncCallback<Void>() {

					public void onFailure(Throwable caught) {
						Window.alert("Coucou j'ai raté !");
					}

					public void onSuccess(Void result) { 
						md.getNumber(new AsyncCallback<Integer>() {

							public void onFailure(Throwable caught) {
								// TODO Auto-generated method stub
								
							}

							public void onSuccess(Integer result) {
								Window.alert("Coucou : " + result);
							}
						});
					}
				});

			}
		});

	}
}
