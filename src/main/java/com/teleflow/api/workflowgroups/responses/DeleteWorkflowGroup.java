package co.novu.api.workflowgroups.responses;

import lombok.Data;

@Data
public class DeleteWorkflowGroup {
    private Boolean acknowledged;
    private String status;
}
