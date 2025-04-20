pipeline {
    agent any

    tools {
        jdk 'jdk-17'         // Go to Jenkins -> Global Tool Configuration -> Name this tool 'jdk-17'
        maven 'maven-3.9.6'  // Same for Maven
    }

    environment {
        MAVEN_HOME = tool 'maven-3.9.6'
        JAVA_HOME = tool 'jdk-17'
        PATH = "${MAVEN_HOME}/bin:${JAVA_HOME}/bin:${env.PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/taecreative/cen4802.git', branch: 'main'
            }
        }

        stage('Build with Maven in Docker') {
            steps {
                echo 'Running Maven inside Docker container...'
                sh '''
                    docker run --rm \
                    -v "$PWD":/app \
                    -w /app \
                    maven:3.9.6-eclipse-temurin-17 \
                    mvn clean install
                '''
            }
        }
    }

    post {
        always {
            echo 'Build process finished.'
        }
    }
}
