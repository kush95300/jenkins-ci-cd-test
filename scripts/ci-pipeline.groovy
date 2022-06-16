pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'CI Pipeline'
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
