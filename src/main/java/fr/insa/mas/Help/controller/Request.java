package fr.insa.mas.Help.controller;

public class Request {
    private String requesterName;
    private String requestDetails;
    private boolean accepted;
    private String status;

    public Request(String requesterName, String requestDetails) {
        this.requesterName = requesterName;
        this.requestDetails = requestDetails;
        this.accepted = false; // Par défaut, la demande n'est pas acceptée
    }

    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
