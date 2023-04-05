pipelineJob('frontend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/zax75ster/Frontend")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}