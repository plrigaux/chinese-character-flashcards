package com.plr.iso29110.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.plr.iso29110.shared.Bug;

@RemoteServiceRelativePath("BugReportService")
public interface BugReportService extends RemoteService {

	Boolean submitBug(Bug bug);
}
