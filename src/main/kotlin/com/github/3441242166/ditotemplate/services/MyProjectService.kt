package com.github.3441242166.ditotemplate.services

import com.intellij.openapi.project.Project
import com.github.3441242166.ditotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
