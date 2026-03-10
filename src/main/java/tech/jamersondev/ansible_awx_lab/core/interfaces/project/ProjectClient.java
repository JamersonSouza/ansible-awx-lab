package tech.jamersondev.ansible_awx_lab.core.interfaces.project;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tech.jamersondev.ansible_awx_lab.core.model.transport.response.AwxPagedResponse;

@FeignClient(name = "projectClient", url = "${awx.url}")
public interface ProjectClient {

    @GetMapping("/api/v2/projects")
    AwxPagedResponse list(@RequestParam(name = "order_by") String name, @RequestParam(name = "page") int page, @RequestParam(name = "page_size") int pageSize);

}
