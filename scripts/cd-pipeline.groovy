pipeline {
    agent any
    stages {
        stage('deploy') {
            steps {
                echo 'Deploying the image to Gke'
                //sh 'docker push gcr.io/kush95300/test-application'
            }
        }
    }
    post { 
        always { 
            echo 'Image deployed send email'
        }
    }
}
