package services;

import backend.AdminDAO;
import javafx.collections.ObservableList;
import models.PendingJoinRequest;

public class AdminDashboardService {

    private AdminDAO adminDashboardDB;

    public AdminDashboardService() {
        this.adminDashboardDB = new AdminDAO();
    }

    // Method to approve the join request (move to Users table)
    public void approveJoinRequest(PendingJoinRequest request) {
        adminDashboardDB.acceptRequest(request);
    }

    // Method to reject the join request (delete from PendingRegistrations)
    public void rejectJoinRequest(PendingJoinRequest request) {
        adminDashboardDB.declineRequest(request);
    }

    public ObservableList<PendingJoinRequest> fetchPendingRequest() {
        return adminDashboardDB.fetchPendingRequests();
    }
    
   
}
