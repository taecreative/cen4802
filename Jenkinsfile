pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Starting Maven Build...'
                sh 'mvn clean install'
            }
        }

        stage('Post-Build') {
            steps {
                echo 'Build completed successfully!'
            }
        }
    }
}
