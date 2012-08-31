package com.plr.iso29110.client;

import java.util.Collection;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.plr.iso29110.shared.BonitaProcessInstance;
import com.plr.iso29110.shared.BonitaTask;
import com.plr.iso29110.shared.Bug;

public interface BugReportServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.plr.iso29110.client.BugReportService
     */
    void submitBug( com.plr.iso29110.shared.Bug p0, AsyncCallback<java.lang.Boolean> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static BugReportServiceAsync instance;

        public static final BugReportServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (BugReportServiceAsync) GWT.create( BugReportService.class );
                ServiceDefTarget target = (ServiceDefTarget) instance;
                target.setServiceEntryPoint( GWT.getModuleBaseURL() + "BugReportService" );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }

	void listBugsToReview(AsyncCallback<List<Bug>> callback);

	void rejectBug(String taskId, AsyncCallback<Boolean> callback);

	void acceptBug(String taskId, String priority, AsyncCallback<Boolean> callback);

	void retieveBug(String taskId, AsyncCallback<Bug> callback);

	void getProcessInstances(AsyncCallback<Collection<BonitaProcessInstance>> callback);

	void getReadyTasks(AsyncCallback<List<BonitaTask>> callback);
}
