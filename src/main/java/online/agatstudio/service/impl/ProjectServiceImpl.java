package online.agatstudio.service.impl;

import online.agatstudio.persistence.model.Project;
import online.agatstudio.persistence.repository.IProjectRepository;
import online.agatstudio.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements IProjectService {

    private final IProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }
}
