package com.plr.iso29110.server;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.plr.iso29110.client.BugReportService;
import com.plr.iso29110.server.bonita.BonitaProcessManagement;
import com.plr.iso29110.shared.BonitaProcessInstance;
import com.plr.iso29110.shared.BonitaTask;
import com.plr.iso29110.shared.Bug;

public class BugReportServiceImp extends RemoteServiceServlet implements BugReportService {



	@Override
	public Boolean submitBug(Bug bug) {
	
		try {
			new BonitaProcessManagement().createBug(bug.getProject(), bug.getVersion(), bug.getSummary());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<Bug> listBugsToReview() {
		
		List<Bug> list = new ArrayList<>();
		
		try {
			list = new BonitaProcessManagement().listBugsToReview();
		} catch (Exception e) {
			e.printStackTrace();			
		}
		
		return list;
	}

	@Override
	public Boolean acceptBug(String taskId, String priority) {
		try {
			new BonitaProcessManagement().acceptBug(taskId, priority);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Boolean rejectBug(String taskId) {
		try {
			new BonitaProcessManagement().rejectBug(taskId);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Bug retieveBug(String taskId) {
		Bug bug = null;
		try {
			bug = new BonitaProcessManagement().getBug(taskId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bug;
	}

	@Override
	public Collection<BonitaProcessInstance> getProcessInstances() {
		Collection<BonitaProcessInstance> bonitaProcessInstances = java.util.Collections.emptyList();
		try {
			bonitaProcessInstances = new BonitaProcessManagement().getProcessInstances();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bonitaProcessInstances;
	}

	
	@Override
	public List<BonitaTask> getReadyTasks() {
		List<BonitaTask> bonitaTask = java.util.Collections.emptyList();
		try {
			bonitaTask = new BonitaProcessManagement().getReadyTasks();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bonitaTask;
	}
}
