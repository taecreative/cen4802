pipeline {
    agent {
        docker {
            image 'maven:3.9.6-eclipse-temurin-17'
        }
    }

    stages {
        stage('Build') {
            steps {
                echo 'Using Maven inside Docker container...'
                sh 'mvn clean install'
            }
        }

        stage('Post-Build') {
            steps {
                echo '✅ Build complete!'
            }
        }
    }
}
