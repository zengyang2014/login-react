pipeline{
    agent { docker 'node:7.10.1' }
    stages {
            stage('Build') {
                steps {
                    echo 'Building..'
                    sh 'echo "Hello Jenkins"'
                    sh 'ls -lah'
                }
            }
            stage('Test') {
                steps {
                    echo 'Testing..'
                }
            }
            stage('Deploy') {
                steps {
                    echo 'Deploying....'
                }
            }
        }
} 
