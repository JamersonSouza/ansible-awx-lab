package tech.jamersondev.ansible_awx_lab.core.model.transport.response;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public record AwxPagedResponse(int count, @JsonAlias("results") List<ProjectResponse> projectResponse) {
}
