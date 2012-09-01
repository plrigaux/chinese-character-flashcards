package com.plr.iso29110.shared;

public enum ActivityState {
	 /**
	   * Activity has been created and initialized.
	   */
	  READY,
	  /**
	   * Activity is executing.
	   */
	  EXECUTING,
	  /**
	   * Activity (is a task) has been suspended (the task that was READY or EXECUTING).
	   */
	  SUSPENDED,
	  /**
	   * Activity is finished.
	   */
	  FINISHED,
	  /**
	   * Activity has been cancelled by a user.
	   */
	  CANCELLED,
	  /**
	   * Activity has been aborted by the system.
	   */
	  ABORTED,
	  /**
	   * Activity has been skipped by a user. 
	   */
	  SKIPPED,
	  
	  /**
	   *Activity has failed 
	   */
	  FAILED;
}
