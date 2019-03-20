package io.renren.service;

import io.renren.entity.VulnProjectEntity;

public interface VulnProjectService {
    VulnProjectEntity getVulnProject(long reportID);
}
