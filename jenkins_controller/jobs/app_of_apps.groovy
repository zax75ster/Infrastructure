pipelineJob('app_of_apps') {
    parameters {
        stringParam('backendDockerTag', '', 'Backend docker image tag')
        stringParam('frontendDockerTag', '', 'Frontend docker image tag')
    }

    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/zax75ster/App_of_apps")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}