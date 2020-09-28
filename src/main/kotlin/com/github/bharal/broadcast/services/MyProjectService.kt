package com.github.bharal.broadcast.services

import com.intellij.openapi.project.Project
import com.github.bharal.broadcast.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
