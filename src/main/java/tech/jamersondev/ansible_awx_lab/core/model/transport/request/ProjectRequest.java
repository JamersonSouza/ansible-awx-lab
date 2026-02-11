package tech.jamersondev.ansible_awx_lab.core.model.transport.request;

public record ProjectRequest(String name, String scm_type, String scm_url) {
}
