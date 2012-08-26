package com.plr.iso29110.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

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
}
