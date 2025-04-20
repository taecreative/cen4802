pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9'   // Make sure this matches the Maven version set up in Jenkins
        jdk 'Java 17'         // Or whatever label you gave your JDK in Jenkins
    }

    environment {
        IMAGE_NAME = 'taes-todo-app'
    }

    stages {
        stage('Clone Repo') {
            steps {
                git 'https://github.com/taecreative/cen4802.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $IMAGE_NAME .'
            }
        }

        stage('Run Docker Container') {
            steps {
                // Try to stop the container if it's already running
                sh 'docker stop $IMAGE_NAME || true'
                sh 'docker rm $IMAGE_NAME || true'
                // Run the new container
                sh 'docker run -d -p 8080:8080 --name $IMAGE_NAME $IMAGE_NAME'
            }
        }
    }

    post {
        success {
            echo '✅ Build and deploy succeeded!'
        }
        failure {
            echo '❌ Build or deploy failed.'
        }
    }
}
