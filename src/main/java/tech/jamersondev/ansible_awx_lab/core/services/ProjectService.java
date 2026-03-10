package tech.jamersondev.ansible_awx_lab.core.services;

import org.springframework.stereotype.Service;
import tech.jamersondev.ansible_awx_lab.core.interfaces.project.ProjectClient;
import tech.jamersondev.ansible_awx_lab.core.model.transport.response.AwxPagedResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {

    private final ProjectClient projectClient;

    public ProjectService(ProjectClient projectClient) {
        this.projectClient = projectClient;
    }

    public List<AwxPagedResponse> list(String name, int page, int pageSize){
        List<AwxPagedResponse> projects = new ArrayList<>();
        AwxPagedResponse list = this.projectClient.list(name, page, pageSize);
        projects.add(list);
        return projects;
    }
}
