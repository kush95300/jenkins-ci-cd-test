pipeline {
    agent any
    stages {
        stage('scm') {
            steps {
                echo 'Downloading the source code'
                git branch: 'test-application', url: 'https://github.com/kush95300/jenkins-ci-cd-test.git'
            }
        }
        stage('build') {
            steps {
                echo 'Building the image'
                //sh 'docker build -t test-application .'
                sh 'ls'
            }
        }
        stage('test') {
            steps {
                echo 'Testing the image'
                //sh 'docker run -it test-application'
            }
        }
        stage('upload') {
            steps {
                echo 'Uploading the image to GCR'
                //sh 'docker push gcr.io/kush95300/test-application'
            }
        }
    }
    post { 
        success { 
            build job: 'cd-pipeleine'
        }
        always { 
            echo 'Image uploaded send email'
        }
    }
}
