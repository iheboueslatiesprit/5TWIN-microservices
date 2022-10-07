pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World';
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
}
