package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Device {

    String name;
    boolean policyBased;
    String[] policies;
    String policyNameInInitialPlan;
    boolean hasSeveralPolicies;
    String details;
    String checkedInInitialPlan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPolicyBased() {
        return policyBased;
    }

    public void setPolicyBased(boolean policyBased) {
        this.policyBased = policyBased;
    }

    public String[] getPolicies() {
        return policies;
    }

    public void setPolicies(String[] policies) {
        this.policies = policies;
    }

    public String getPolicyNameInInitialPlan() {
        return policyNameInInitialPlan;
    }

    public void setPolicyNameInInitialPlan(String policyNameInInitialPlan) {
        this.policyNameInInitialPlan = policyNameInInitialPlan;
    }

    public boolean isHasSeveralPolicies() {
        return hasSeveralPolicies;
    }

    public void setHasSeveralPolicies(boolean hasSeveralPolicies) {
        this.hasSeveralPolicies = hasSeveralPolicies;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCheckedInInitialPlan() {
        return checkedInInitialPlan;
    }

    public void setCheckedInInitialPlan(String checkedInInitialPlan) {
        this.checkedInInitialPlan = checkedInInitialPlan;
    }
}
