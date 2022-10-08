pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World';
                emailext body: 'Pipeline test', to: "iheb.oueslati@esprit.tn", subject: 'Test'
            }
        }
        stage('Checkout git') {
            steps {
                echo 'pulling';
                git branch: 'master',
                url: 'https://github.com/iheboueslatiesprit/5TWIN-microservices.git'
            }
        }
    }
        post {
            failure {
                emailext body: 'Pipeline fail', to: "iheb.oueslati@esprit.tn", subject: 'Test'
            }
        }
}

