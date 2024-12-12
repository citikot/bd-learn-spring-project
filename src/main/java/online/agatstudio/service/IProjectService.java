package online.agatstudio.service;

import online.agatstudio.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {

    Optional<Project> findById(Long id);

    Project save(Project project);
}
