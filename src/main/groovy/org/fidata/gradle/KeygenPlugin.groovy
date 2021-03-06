#!/usr/bin/env groovy
/*
 * org.fidata.keygen Gradle plugin
 * Copyright © 2018  Basil Peace
 *
 * This file is part of gradle-keygen-plugin.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.fidata.gradle

import groovy.transform.CompileStatic
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.fidata.gradle.tasks.GenerateSSHKey

/**
 * Gradle plugin for SSH key generation
 */
@CompileStatic
final class KeygenPlugin implements Plugin<Project> {
  void apply(Project project) {
    project.extensions.create 'keygen', KeygenExtension
    project.extensions.extraProperties[GenerateSSHKey.simpleName] = GenerateSSHKey
  }
}
