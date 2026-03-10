package tech.jamersondev.ansible_awx_lab.core.model.transport.response;

public record ProjectResponse(String name, String description, String scm_type, String status, String scm_url) {
}
