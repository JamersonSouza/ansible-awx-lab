package tech.jamersondev.ansible_awx_lab.core.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.jamersondev.ansible_awx_lab.core.model.transport.response.AwxPagedResponse;
import tech.jamersondev.ansible_awx_lab.core.services.ProjectService;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public ResponseEntity<List<AwxPagedResponse>> list(@RequestParam(name = "order_by") String name,
                                                       @RequestParam(name = "page", defaultValue = "1") int page, @RequestParam(name = "page_size", defaultValue = "20") int pageSize){

        List<AwxPagedResponse> list = this.projectService.list(name, page, pageSize);
        return ResponseEntity.ok(list);
    }

}
