stage('Build') {
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
