package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'A'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("A")) {
    expectSteps {
        script {
            scriptContent = "echo b"
        }
    }
    steps {
        insert(1) {
            gradle {
                param("ui.gradleRUnner.gradle.build.file", "dfdf")
            }
        }
    }
}
