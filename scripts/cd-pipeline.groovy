pipeline {
    agent any
    stages {
        stage('deploy') {
            steps {
                echo 'Deploying the image to Gke'
            }
        }
    }
    post { 
        always { 
            echo 'Image deployed send email'
        }
    }
}
