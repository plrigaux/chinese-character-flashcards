package com.plr.iso29110.server;

import org.ow2.bonita.util.BonitaConstants;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.plr.iso29110.client.BugReportService;
import com.plr.iso29110.server.bonita.BonitaProcessManagement;
import com.plr.iso29110.shared.Bug;

public class BugReportServiceImp extends RemoteServiceServlet implements BugReportService {



	@Override
	public Boolean submitBug(Bug bug) {
		System.out.println("yes");
		try {
			new BonitaProcessManagement().createBug(bug.getProject(), bug.getVersion(), bug.getSummary());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
