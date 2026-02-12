package tech.jamersondev.ansible_awx_lab.core.services;

import org.springframework.stereotype.Service;
import tech.jamersondev.ansible_awx_lab.core.interfaces.AwxClient;
import tech.jamersondev.ansible_awx_lab.core.model.transport.request.ProjectRequest;
import tech.jamersondev.ansible_awx_lab.core.model.transport.request.RunPlaybookRequest;
import tech.jamersondev.ansible_awx_lab.core.model.transport.response.JobLaunchResponse;

import java.util.UUID;

@Service
public class AwxOrchestrationService {

    private final AwxClient awxClient;

    public AwxOrchestrationService(AwxClient awxClient) {
        this.awxClient = awxClient;
    }

    public JobLaunchResponse runPlaybook(RunPlaybookRequest runPlaybookRequest){
        // TO DO
        this.createProject();
        return null;
    }

    private void createProject() {
        ProjectRequest projectRequest = new ProjectRequest(String.format("project-", UUID.randomUUID()), "git", "teste");
        awxClient.createProject(projectRequest);
    }
}
