package com.cat.zeus.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

class SecondPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        System.out.println("SecondPlugin ========================")
        System.out.println("插件!!!!!!!!!!")
        System.out.println("SecondPlugin ========================")
    }
}