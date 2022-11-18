package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.triggers.ScheduleTrigger
import jetbrains.buildServer.configs.kotlin.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.triggers.schedule
import jetbrains.buildServer.configs.kotlin.triggers.vcs
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'Publisher'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("Publisher")) {
    vcs {
        add(DslContext.settingsRoot.id!!)
    }

    triggers {
        val trigger1 = find<ScheduleTrigger> {
            schedule {
                schedulingPolicy = daily {
                    hour = 17
                }
                branchFilter = "+:<default>"
                triggerBuild = always()
                withPendingChangesOnly = false
                param("cronExpression_min", "/2")

                enforceCleanCheckout = true
                enforceCleanCheckoutForDependencies = true
                buildParams {
                    param("rebuildDependencies", "force")
                }
            }
        }
        trigger1.apply {
            schedulingPolicy = cron {
                seconds = "0"
                minutes = "41"
                hours = "14"
                dayOfMonth = "*"
                dayOfWeek = "?"
                month = "*"
                year = "*"
                timezone = "SERVER"
            }
            param("hour", "12")
            clearBuildParams()
            buildParams {
                param("rebuildDependencies", "force")
            }
        }
        val trigger2 = find<VcsTrigger> {
            vcs {
                quietPeriodMode = VcsTrigger.QuietPeriodMode.USE_DEFAULT
                triggerRules = "-:project-base/**/*"
                watchChangesInDependencies = true
            }
        }
        trigger2.apply {
            quietPeriodMode = VcsTrigger.QuietPeriodMode.DO_NOT_USE
            branchFilter = ""

        }
    }
}
