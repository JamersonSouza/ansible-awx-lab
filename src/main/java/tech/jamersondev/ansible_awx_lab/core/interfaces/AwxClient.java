package tech.jamersondev.ansible_awx_lab.core.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tech.jamersondev.ansible_awx_lab.core.model.transport.request.ProjectRequest;
import tech.jamersondev.ansible_awx_lab.core.model.transport.response.ProjectResponse;

@FeignClient(name = "awxClient", url = "${awx.url}")
public interface AwxClient {

    @PostMapping("/api/v2/projects")
    ProjectResponse createProject(@RequestBody ProjectRequest projectRequest);

}
