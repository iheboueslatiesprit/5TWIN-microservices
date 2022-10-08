pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World';
                mail body: 'Pipeline', to: "iheb.oueslati@esprit.tn", subject: 'pipeline executed'
            }
        }
        stage('Checkout git') {
            steps {
                echo 'pulling';
                git branch: 'master',
                url: 'https://github.com/iheboueslatiesprit/5TWIN-microservices.git'
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean install'
                }
                }
    }
        post {
            failure {
                mail body: 'Pipeline fail', to: "oueslatiiheb0@gmail.com", subject: 'Pipeline fail'
            }
        }
}

