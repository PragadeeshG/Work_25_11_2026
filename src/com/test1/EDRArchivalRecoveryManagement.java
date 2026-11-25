package com.test1;

public class EDRArchivalRecoveryManagement {
	private long recoveryManagementId;
	private long archivalConfigurationId;
	private long archivalExecution;
	private long proposalId;
	private String recoveryRequestId;
	private String recordId;
	private String recordName;
	private String recordVersion;
	private String archiveRepository;
	private String targetRecoveryRepository;
	private String recoveryType;
	private String recoveryReason;
	private String recoveryPriority;
	private String requestedBy;
	private String recoveryApprovalRequired;
	private String recoveryApprovalStatus;
	private long totalRecordsRequested;
	private long successfullyRecoveredRecords;

	public EDRArchivalRecoveryManagement() {

	}

	public EDRArchivalRecoveryManagement(long recoveryManagementId, long archivalConfigurationId,
			long archivalExecution, long proposalId, String recoveryRequestId, String recordId, String recordName,
			String recordVersion, String archiveRepository, String targetRecoveryRepository, String recoveryType,
			String recoveryReason, String recoveryPriority, String requestedBy, String recoveryApprovalRequired,
			String recoveryApprovalStatus, long totalRecordsRequested, long successfullyRecoveredRecords) {
		super();
		this.recoveryManagementId = recoveryManagementId;
		this.archivalConfigurationId = archivalConfigurationId;
		this.archivalExecution = archivalExecution;
		this.proposalId = proposalId;
		this.recoveryRequestId = recoveryRequestId;
		this.recordId = recordId;
		this.recordName = recordName;
		this.recordVersion = recordVersion;
		this.archiveRepository = archiveRepository;
		this.targetRecoveryRepository = targetRecoveryRepository;
		this.recoveryType = recoveryType;
		this.recoveryReason = recoveryReason;
		this.recoveryPriority = recoveryPriority;
		this.requestedBy = requestedBy;
		this.recoveryApprovalRequired = recoveryApprovalRequired;
		this.recoveryApprovalStatus = recoveryApprovalStatus;
		this.totalRecordsRequested = totalRecordsRequested;
		this.successfullyRecoveredRecords = successfullyRecoveredRecords;
	}

	public long getRecoveryManagementId() {
		return recoveryManagementId;
	}

	public void setRecoveryManagementId(long recoveryManagementId) {
		this.recoveryManagementId = recoveryManagementId;
	}

	public long getArchivalConfigurationId() {
		return archivalConfigurationId;
	}

	public void setArchivalConfigurationId(long archivalConfigurationId) {
		this.archivalConfigurationId = archivalConfigurationId;
	}

	public long getArchivalExecution() {
		return archivalExecution;
	}

	public void setArchivalExecution(long archivalExecution) {
		this.archivalExecution = archivalExecution;
	}

	public long getProposalId() {
		return proposalId;
	}

	public void setProposalId(long proposalId) {
		this.proposalId = proposalId;
	}

	public String getRecoveryRequestId() {
		return recoveryRequestId;
	}

	public void setRecoveryRequestId(String recoveryRequestId) {
		this.recoveryRequestId = recoveryRequestId;
	}

	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRecordName() {
		return recordName;
	}

	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}

	public String getRecordVersion() {
		return recordVersion;
	}

	public void setRecordVersion(String recordVersion) {
		this.recordVersion = recordVersion;
	}

	public String getArchiveRepository() {
		return archiveRepository;
	}

	public void setArchiveRepository(String archiveRepository) {
		this.archiveRepository = archiveRepository;
	}

	public String getTargetRecoveryRepository() {
		return targetRecoveryRepository;
	}

	public void setTargetRecoveryRepository(String targetRecoveryRepository) {
		this.targetRecoveryRepository = targetRecoveryRepository;
	}

	public String getRecoveryType() {
		return recoveryType;
	}

	public void setRecoveryType(String recoveryType) {
		this.recoveryType = recoveryType;
	}

	public String getRecoveryReason() {
		return recoveryReason;
	}

	public void setRecoveryReason(String recoveryReason) {
		this.recoveryReason = recoveryReason;
	}

	public String getRecoveryPriority() {
		return recoveryPriority;
	}

	public void setRecoveryPriority(String recoveryPriority) {
		this.recoveryPriority = recoveryPriority;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getRecoveryApprovalRequired() {
		return recoveryApprovalRequired;
	}

	public void setRecoveryApprovalRequired(String recoveryApprovalRequired) {
		this.recoveryApprovalRequired = recoveryApprovalRequired;
	}

	public String getRecoveryApprovalStatus() {
		return recoveryApprovalStatus;
	}

	public void setRecoveryApprovalStatus(String recoveryApprovalStatus) {
		this.recoveryApprovalStatus = recoveryApprovalStatus;
	}

	public long getTotalRecordsRequested() {
		return totalRecordsRequested;
	}

	public void setTotalRecordsRequested(long totalRecordsRequested) {
		this.totalRecordsRequested = totalRecordsRequested;
	}

	public long getSuccessfullyRecoveredRecords() {
		return successfullyRecoveredRecords;
	}

	public void setSuccessfullyRecoveredRecords(long successfullyRecoveredRecords) {
		this.successfullyRecoveredRecords = successfullyRecoveredRecords;
	}

}
