package com.plr.iso29110.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.plr.iso29110.client.BugReportService;
import com.plr.iso29110.shared.Bug;

public class BugReportServiceImp extends RemoteServiceServlet implements BugReportService {



	@Override
	public Boolean submitBug(Bug bug) {
		System.out.println("yes");
		
		return true;
	}

}
