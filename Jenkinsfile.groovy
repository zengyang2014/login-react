pipeline{
    agent { docker 'node:7.10.1' }
    stages {
            stage('Test') {
                steps {
                    sh 'echo "Fail!"; exit 1'
                }
            }
        }
    post {
        always {
            echo 'this will always run'
        }

        success {
            echo 'success'
        }

        failure {
            echo 'failed'
        }

        changed {
            echo 'changed'
        }

        unstable {
            echo 'unstable'
        }
    }
} 
