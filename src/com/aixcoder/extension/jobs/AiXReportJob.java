package com.aixcoder.extension.jobs;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import com.aixcoder.core.API;
import com.aixcoder.core.ReportType;

public class AiXReportJob extends Job {

	private ReportType type;

	public AiXReportJob(ReportType type) {
		super("AiX Report " + type);
		this.type = type;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		API.report(type);
		return Status.OK_STATUS;
	}

}
