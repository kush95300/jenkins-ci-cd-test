pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'CD Pipeline'
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}