package tech.jamersondev.ansible_awx_lab.core.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tech.jamersondev.ansible_awx_lab.core.model.transport.request.InventoryRequest;
import tech.jamersondev.ansible_awx_lab.core.model.transport.request.JobTemplateRequest;
import tech.jamersondev.ansible_awx_lab.core.model.transport.request.ProjectRequest;
import tech.jamersondev.ansible_awx_lab.core.model.transport.response.*;

@FeignClient(name = "awxClient", url = "${awx.url}")
public interface AwxClient {

    @PostMapping("/api/v2/projects")
    ProjectResponse createProject(@RequestBody ProjectRequest projectRequest);

    @PostMapping("/api/v2/inventories/")
    InventoryResponse createInventory(@RequestBody InventoryRequest request);

    @PostMapping("/api/v2/job_templates/")
    JobTemplateResponse createJobTemplate(@RequestBody JobTemplateRequest request);

    @PostMapping("/api/v2/job_templates/{id}/launch/")
    JobLaunchResponse launchJob(@PathVariable Long id);

    @GetMapping("/api/v2/jobs/{id}/")
    JobStatusResponse getJobStatus(@PathVariable Long id);

}
