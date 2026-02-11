package tech.jamersondev.ansible_awx_lab.core.model.transport.request;

public record JobTemplateRequest(String name, String job_type, Long inventory,
                                 Long project, String playbook) {
}
