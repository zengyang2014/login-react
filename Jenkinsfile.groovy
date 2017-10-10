pipeline{
    agent { docker 'node:7.10.1' }
    stages {
//            stage('Build') {
//                steps {
//                    echo 'Building..'
//                    sh 'echo "Hello Jenkins"'
//                    sh 'ls -lah'
//                }
//            }
            stage('Test') {
                steps {
                    sh 'echo "Fail!"; exit 1'
                }
            }
//            stage('Deploy') {
//                steps {
//                    echo 'Deploying....'
//
//                    retry(3) {
//                        sh './fake-deploy.sh'
//                    }
//
//                    timeout(time:1, unit:'MINUTES') {
//                        sh './fake-check.sh'
//                    }
//                }
//            }
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
