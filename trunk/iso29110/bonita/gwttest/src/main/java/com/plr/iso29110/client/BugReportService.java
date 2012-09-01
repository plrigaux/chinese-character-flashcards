package com.plr.iso29110.client;

import java.util.Collection;
import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.plr.iso29110.shared.BonitaProcessInstance;
import com.plr.iso29110.shared.BonitaTask;
import com.plr.iso29110.shared.Bug;
import com.plr.iso29110.shared.Task;

@RemoteServiceRelativePath("BugReportService")
public interface BugReportService extends RemoteService {

	Boolean submitBug(Bug bug);
	List<Bug> listBugsToReview();
	Boolean acceptBug(String taskId, String priority);
	Boolean rejectBug(String taskId);
	Bug retieveBug(String taskId);
	Collection<BonitaProcessInstance> getProcessInstances();
	List<BonitaTask> getReadyTasks();
	List<BonitaTask> getReadyTasks(String processInstanceId);
	Task getTask(String taskId);
	Boolean execute(Task task);
}
