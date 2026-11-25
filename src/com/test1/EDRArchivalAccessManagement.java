package com.test1;

public class EDRArchivalAccessManagement {
	private long accessManagementId;
	private long archivalConfigurationId;
	private long proposalId;
	private String recordId;
	private String recordName;
	private String archiveRepositoryId;
	private String accessRequestId;
	private String requestedBy;
	private String requesterRole;
	private String businessUnit;
	private String accessType;
	private String accessPurpose;
	private String accessPermissionLevel;
	private String recordSensitivityLevel;
	private String accessApprovalRequired;
	private String approvedBy;
	private String accessRequestedTime;
	private String accessGrantedTime;

	public EDRArchivalAccessManagement() {

	}

	public EDRArchivalAccessManagement(long accessManagementId, long archivalConfigurationId, long proposalId,
			String recordId, String recordName, String archiveRepositoryId, String accessRequestId, String requestedBy,
			String requesterRole, String businessUnit, String accessType, String accessPurpose,
			String accessPermissionLevel, String recordSensitivityLevel, String accessApprovalRequired,
			String approvedBy, String accessRequestedTime, String accessGrantedTime) {
		super();
		this.accessManagementId = accessManagementId;
		this.archivalConfigurationId = archivalConfigurationId;
		this.proposalId = proposalId;
		this.recordId = recordId;
		this.recordName = recordName;
		this.archiveRepositoryId = archiveRepositoryId;
		this.accessRequestId = accessRequestId;
		this.requestedBy = requestedBy;
		this.requesterRole = requesterRole;
		this.businessUnit = businessUnit;
		this.accessType = accessType;
		this.accessPurpose = accessPurpose;
		this.accessPermissionLevel = accessPermissionLevel;
		this.recordSensitivityLevel = recordSensitivityLevel;
		this.accessApprovalRequired = accessApprovalRequired;
		this.approvedBy = approvedBy;
		this.accessRequestedTime = accessRequestedTime;
		this.accessGrantedTime = accessGrantedTime;
	}

	public long getAccessManagementId() {
		return accessManagementId;
	}

	public void setAccessManagementId(long accessManagementId) {
		this.accessManagementId = accessManagementId;
	}

	public long getArchivalConfigurationId() {
		return archivalConfigurationId;
	}

	public void setArchivalConfigurationId(long archivalConfigurationId) {
		this.archivalConfigurationId = archivalConfigurationId;
	}

	public long getProposalId() {
		return proposalId;
	}

	public void setProposalId(long proposalId) {
		this.proposalId = proposalId;
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

	public String getArchiveRepositoryId() {
		return archiveRepositoryId;
	}

	public void setArchiveRepositoryId(String archiveRepositoryId) {
		this.archiveRepositoryId = archiveRepositoryId;
	}

	public String getAccessRequestId() {
		return accessRequestId;
	}

	public void setAccessRequestId(String accessRequestId) {
		this.accessRequestId = accessRequestId;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public String getRequesterRole() {
		return requesterRole;
	}

	public void setRequesterRole(String requesterRole) {
		this.requesterRole = requesterRole;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}

	public String getAccessPurpose() {
		return accessPurpose;
	}

	public void setAccessPurpose(String accessPurpose) {
		this.accessPurpose = accessPurpose;
	}

	public String getAccessPermissionLevel() {
		return accessPermissionLevel;
	}

	public void setAccessPermissionLevel(String accessPermissionLevel) {
		this.accessPermissionLevel = accessPermissionLevel;
	}

	public String getRecordSensitivityLevel() {
		return recordSensitivityLevel;
	}

	public void setRecordSensitivityLevel(String recordSensitivityLevel) {
		this.recordSensitivityLevel = recordSensitivityLevel;
	}

	public String getAccessApprovalRequired() {
		return accessApprovalRequired;
	}

	public void setAccessApprovalRequired(String accessApprovalRequired) {
		this.accessApprovalRequired = accessApprovalRequired;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public String getAccessRequestedTime() {
		return accessRequestedTime;
	}

	public void setAccessRequestedTime(String accessRequestedTime) {
		this.accessRequestedTime = accessRequestedTime;
	}

	public String getAccessGrantedTime() {
		return accessGrantedTime;
	}

	public void setAccessGrantedTime(String accessGrantedTime) {
		this.accessGrantedTime = accessGrantedTime;
	}

}
